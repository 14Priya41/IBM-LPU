package com.example.SpringHibernateIntegration.dao;
import java.util.Collection;

import com.example.SpringHibernateIntegration.entity.Employee;



public interface EmployeeDAO {
	public Employee createEmployee(Employee employee);

	public void removeEmployee(int id);

	public Employee raiseEmployeeSalary(int id, long raise);

	public Employee findEmployee(int id);

	public Collection<Employee> findAllEmployees();
	
}
