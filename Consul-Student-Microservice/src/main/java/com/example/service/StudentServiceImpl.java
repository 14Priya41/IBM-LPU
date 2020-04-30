package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentDAO;
import com.example.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDAO studentDao;

	@Override
	public Student saveOrUpdate(Student student) {
		return studentDao.save(student);
	}

	@Override
	public Iterable<Student> getAllStudent() {

		return studentDao.findAll();
	}

	@Override
	public Iterable<Student> findBySchoolName(String school_name) {
		return studentDao.findBySchoolname(school_name);
	}
}
