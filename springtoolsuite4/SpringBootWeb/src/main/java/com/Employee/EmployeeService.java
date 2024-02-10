package com.Employee;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;



@Component

public class EmployeeService implements IEmployeeService 
{
	
	@Autowired(required=true)
	EmployeeDAO ED=new EmployeeDAO();
	
	
	
	
	public void MakeEmployee()
	{
		 ED.CreateEmployee();
	}
	
	public void DisplayEmployees()
	{
		ED.DisplayList();
	}
	public void DeleteEmployee()
	{
		ED.DeleteEmploye();
	}
	public void UpdateEmployee()
	{
		ED.UpdateEmploye();
	}

}
