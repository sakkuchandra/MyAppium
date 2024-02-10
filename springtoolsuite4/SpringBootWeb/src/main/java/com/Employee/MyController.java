package com.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController




public class MyController 
{
	@Autowired(required=true)
	IEmployeeService es;
	//EmployeeDAO D;
	
	@RequestMapping("/add")
    public void AddEmployee()
    {
		
		
		es.MakeEmployee();
    	//D.CreateEmployee();
		/*
		Employee e=new Employee();
		e.setName("chandra");
		e.setEmail("abc@gmail.com");
		e.setContact("12345678990");
		e.setGender("Male");
		
		System.out.println(e.getName());
		System.out.println(e.getEmail());
		System.out.println(e.getContact());
		System.out.println(e.getGender());
		*/
    	//return "Successfully Displayed";
		System.out.println("Successfully Displayed");
		 
    }
	@RequestMapping("/DisplayAll")
	
	public void DisplayAllEmployees()
	{
		es.DisplayEmployees();
	}
	
	@RequestMapping("/DeleteEmp")
	
	public void Employees()
	{
		es.DeleteEmployee();
	}
	@RequestMapping("/UpdateEmp")
	
	public void updateEmploy()
	{
		es.UpdateEmployee();
	}
}
