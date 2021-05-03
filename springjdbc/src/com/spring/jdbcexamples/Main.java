package com.spring.jdbcexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.mod.Customer;
import com.springjdbcdeo.impl.CustomerDaoImpl;

public class Main {
	public static void main(String[] args) {
		System.out.println("created main class");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDaoImpl c=(CustomerDaoImpl)context.getBean("customer");
		Customer c1 = new Customer();
		//c1.setCustomerid(11);
		//c1.setCustomername(" PRATAP");
		//c1.setCustomerpay(3232);
		//System.out.println(c.persistCustomer(c1));
		System.out.println(c.FetchCustomer(10));
		//System.out.println(c.deleteCustomer());
		
		
	}
}
	


