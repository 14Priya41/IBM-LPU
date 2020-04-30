package com.example.service;

import com.example.model.Student;

public interface StudentService {

public Student saveOrUpdate(Student student);
	
	public Iterable<Student> getAllStudent();
	
	public Iterable<Student> findBySchoolName(String school_name);
}
