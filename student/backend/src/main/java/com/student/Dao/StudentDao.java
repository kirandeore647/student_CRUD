package com.student.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.model.Student;


@Repository
public interface StudentDao extends JpaRepository<Student, Long> {

	@Query (value="SELECT * FROM tbl_student_profile WHERE is_deleted='false' AND is_active='true'",nativeQuery = true)
	List<Student> findAllData();
}
