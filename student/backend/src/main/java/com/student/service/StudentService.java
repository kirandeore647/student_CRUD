package com.student.service;

import java.util.List;

import javax.validation.Valid;

import com.student.model.Student;



public interface StudentService {

	Student saveStudenData(@Valid Student student);

	Student deleteStudentData(Long id);

	List<Student> getAllStudenData();

	Student updateStudentData(Long id, Student student) throws Exception;

}
