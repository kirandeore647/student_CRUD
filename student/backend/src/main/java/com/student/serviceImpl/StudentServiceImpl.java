package com.student.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Dao.StudentDao;
import com.student.model.Student;
import com.student.service.StudentService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class StudentServiceImpl  implements StudentService{
	@Autowired
	StudentDao  studentDao;

	@Override
	public Student saveStudenData(@Valid Student student) {
		return studentDao.save(student);
	}

	@Override
	public Student deleteStudentData(Long id) {
		Student student = studentDao.findById(id).get();
		student.setActive(false);
		student.setDeleted(true);
		studentDao.save(student);
		return student;
	}

	@Override
	public List<Student> getAllStudenData() {
		
		return studentDao.findAllData();
	}

	@Override
	public Student updateStudentData(Long id, Student student) throws Exception {
		Optional<Student> stud = studentDao.findById(id);
		
		if (stud.isPresent()) {
				student.setCreatedDateTime(stud.get().getCreatedDateTime());
				studentDao.save(student);
				return student;
			
		} else {

			throw new Exception("Record not found: " + id);
		}

	}



}
