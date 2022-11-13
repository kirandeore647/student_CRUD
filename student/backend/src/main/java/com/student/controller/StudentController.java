package com.student.controller;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

import lombok.extern.slf4j.Slf4j;




@Slf4j
@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping	
		public Student saveStudenData(@Valid @RequestBody Student student) throws Exception {
			log.info("incontroller");
				return studentService.saveStudenData(student);
			}

	@GetMapping	
		public List<Student> getAllStudenData() {
			return studentService.getAllStudenData();
		}
	
	@DeleteMapping("/{id}")	
		public Student deleteStudentData(@PathVariable Long id) {
			return studentService.deleteStudentData(id);
		}

	 @PutMapping("/{id}")
	    public Student updateStudentData(@PathVariable Long id, @RequestBody Student student) throws Exception {
	    		    	
	        return studentService.updateStudentData(id,student);
	  }

}
