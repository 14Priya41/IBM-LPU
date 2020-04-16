package com.example.SpringHibernateIntegration;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.SpringHibernateIntegration.service.EmployeeService;
import com.example.SpringHibernateIntegration.service.EmployeeServiceImpl;
import com.example.SpringHibernateIntegration.entity.Employee;



public class App 
{
	private static EmployeeService service = null;
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	EmployeeService dao = context.getBean("dao",EmployeeServiceImpl.class);

		/*
		 * Employee e = dao.createEmployee(new Employee("Sachin", 20000));
		 * System.out.println("done!" + e);
		 */
		// dao.removeEmployee(1);
        int id,version;
        String name;
        long salary;
    	int choice;
    	Scanner sc = new Scanner(System.in);
    	do
    	{
    		System.out.println("1.Add new employee");
    		System.out.println("2.Get all employees");
    		System.out.println("3.Raise salary of employee");
    		System.out.println("4.Find employee by id");
    		System.out.println("5.Remove an employee");
    		System.out.println("Enter choice");
    		choice = sc.nextInt();
    		switch(choice)
    		{
    		case 1:
    			System.out.print("Employee Id: ");
				id = sc.nextInt();
				System.out.print("Employee Version: ");
				version=sc.nextInt();
				System.out.print("Employee name: ");
				name=sc.next();
				System.out.print("Employee salary: ");
				salary=sc.nextLong();
				Employee employee = new Employee();
				employee.setId(id);
				employee.setVersion(version);
				employee.setName(name);
				employee.setSalary(salary);
				//student.setId(UUID.randomUUID().toString());
				employee = service.createEmployee(employee);
				System.out.println(employee);
				break;
    		case 2:
    			Collection<Employee> collection = service.findAllEmployees();
    			for (Employee e : collection) {
    				System.out.println(e);
    			}
				break;
    		case 3:
    			Employee employee1 = service.raiseEmployeeSalary(2, 1000);
    			if (employee1 == null) {
    				System.out.println("raise salary aborted.");
    			} else {
    				System.out.println("Updated Employee: " + employee1);
    			}
    		case 4:
    			System.out.print("Employee Id: ");
				id = sc.nextInt();
				Employee employee2 = service.findEmployee(id);
				break;
    		case 5:
    			System.out.print("Employee Id: ");
				id = sc.nextInt();
				service.removeEmployee(id);
				break;
    		case 0:
				System.out.println("Bye!!");
				System.exit(0);
			default:
				System.out.println("Invalid Choice.");
				break;
    			
    		}
    		
    	}while(choice != 6);
		

		
    }
}
