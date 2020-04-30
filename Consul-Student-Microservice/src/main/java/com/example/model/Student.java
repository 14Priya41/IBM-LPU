package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="student")
@Data
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int student_roll_no;
	private String student_name;
	private String student_class;
	private String school_name;
	
	public Student() {
		
	}

	public Student(String student_name, String student_class, String school_name) {
		super();
		this.student_name = student_name;
		this.student_class = student_class;
		this.school_name = school_name;
	}

	


}
