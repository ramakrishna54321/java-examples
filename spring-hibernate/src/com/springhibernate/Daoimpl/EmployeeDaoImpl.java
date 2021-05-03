package com.springhibernate.Daoimpl;

import java.io.Serializable;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springhibernate.interfaces.EmployeeDao;
import com.springhibernate.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	private HibernateTemplate hibernateTemplate;
	
	

	
	
	//@Transactional
	@Override
@Transactional

	public void save(Employee employee) {
		//hibernateTemplate.flush();
		//hibernateTemplate.getSessionFactory().getCurrentSession();
		//checkWriteOperationAllowed
		//hibernateTemplate.setCheckWriteOperations(false);
		//checkWriteOperationAllowed
		Serializable s=hibernateTemplate.save(employee);
		//hibernateTemplate.flush();
		
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	


	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	

	
	

}
