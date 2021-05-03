package com.springhibernate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springhibernate.Daoimpl.EmployeeDaoImpl;
import com.springhibernate.model.Employee;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object o = context.getBean("emp");
		EmployeeDaoImpl dao = (EmployeeDaoImpl) o;
		
		  Employee e1 = new Employee(); e1.setEmpid(101); e1.setEmpname("tarun");
		  e1.setEmpsal(1000);
		 
		dao.save(e1);
	}

}
