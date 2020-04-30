package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.dao.StudentDAO;
import com.example.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulStudentMicroserviceApplication implements CommandLineRunner{
	@Autowired
	private StudentDAO studentDao;
	public static void main(String[] args) {
		SpringApplication.run(ConsulStudentMicroserviceApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	studentDao.save(new Student("Priya", "B-TECH", "LPU"));
	studentDao.save(new Student("Sanjana", "B-COM", "CU"));
	}
}
