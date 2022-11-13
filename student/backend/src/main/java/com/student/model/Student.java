package com.student.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "tbl_student_profile")
public class Student {

	@Id
	@SequenceGenerator(name = "tbl_student_profile_id_seq", sequenceName = "tbl_student_profile_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tbl_student_profile_id_seq")
	@Column(name = "id")
	private Long id;

	@Column(nullable = false, length = 100, name = "name")
	public String name;

	@Column(nullable = false, length = 100, name = "address")
	private String address;

	@Column(nullable = false, length = 10, name = "bloodGroup")
	private String bloodGroup;

	@Column(nullable = false, length = 15, name = "mobileNumber")
	private String mobileNumber;

	@Temporal(TemporalType.DATE)
	@Column(name = "bod")
	private Date bod;
		

	@Column(name = "isActive")
	private boolean isActive = true;

	@Column(name = "isDeleted")
	private boolean isDeleted = false;

	@Column(nullable = true, name = "createdBy")
	private int createdBy;

	@CreationTimestamp
	@Column(name = "createdDateTime")
	private Date createdDateTime;

	@Column(nullable = true, name = "updatedBy")
	private int updatedBy;

	@UpdateTimestamp
	@Column(name = "updatedDateTime")
	private Date updatedDateTime;

}

		
