package com.Employee;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Transactional
@Repository


public class EmployeeDAO 
{
   @PersistenceContext
   EntityManager em;
   
   
   public void CreateEmployee()
   {
	   Employee e=new Employee();
	   e.setName("Raki");
	   e.setGender("male");
	   e.setEmail("rakii@gmail.com");
	   e.setContact("1234567890");
	   em.persist(e);
  }
  
  public void DisplayList()
  {
	  Query q=em.createQuery("from Employee",Employee.class);
	  List l=q.getResultList();
	  Iterator i=l.iterator();
	  
	  while(i.hasNext())
	  {
		  Employee e=(Employee)i.next();
		  System.out.println(e.getName());
		  System.out.println(e.getId());
		  System.out.println(e.getGender());
		  System.out.println(e.getContact());
		  System.out.println(e.getEmail());
	  }
	  
	  
  }
  
  public void DeleteEmploye()
  {
	 Employee emp= em.find(Employee.class, 2);
	 em.remove(emp);
  }
  
  public void UpdateEmploye()
  {
	  Employee emp=em.find(Employee.class, 11);
	  emp.setEmail("raki@yahoomail.com");
  }
   
  
}
