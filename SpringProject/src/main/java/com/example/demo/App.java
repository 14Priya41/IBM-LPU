package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.bean.Name;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Name theName=context.getBean("e",Name.class);
		System.out.println(theName.getFirstName());
		System.out.println(theName.getLastName());
		System.out.println(theName.getAddress());
		
    }
}
