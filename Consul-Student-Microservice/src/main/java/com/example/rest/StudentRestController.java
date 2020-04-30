package com.example.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentService;

@RestController
public class StudentRestController {
	@Autowired
	private StudentService studentService;;

	@GetMapping("/students/{school_name}")
	public Iterable<Student> findStudentBySchoolName(@PathVariable String school_name) {
		return studentService.findBySchoolName(school_name);
}
}