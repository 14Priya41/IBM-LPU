package com.example.SpringHibernateIntegration.service;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringHibernateIntegration.entity.Employee;
import com.example.SpringHibernateIntegration.dao.EmployeeDAO;

@Service("service")

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO dao;
	@Autowired
	public EmployeeServiceImpl(EmployeeDAO dao)
	{
		this.dao = dao;
	}
	@Override
	public Employee createEmployee(Employee employee) 
	{
		return dao.createEmployee(employee);
	}

	@Override
	public void removeEmployee(int id) 
	{
		dao.removeEmployee(id);
	}
	@Override
	public Employee raiseEmployeeSalary(int id, int raise) 
	{
		return dao.raiseEmployeeSalary(id, raise);
	}
	@Override
	public Employee findEmployee(int id) 
	{
		return dao.findEmployee(id);
	}
	@Override
	public Collection<Employee> findAllEmployees()
	{
		return dao.findAllEmployees();
	}
}
