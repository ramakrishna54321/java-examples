package com.springjdbcdeo.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.mysql.cj.protocol.Resultset;
import com.springjdbc.inteface.CustomerDao;
import com.springjdbc.mod.Customer;

public class CustomerDaoImpl implements CustomerDao {
	private DataSource datasource;
	
	public int persistCustomer(Customer customer) {
		String sql = "insert into customer "+"(customerid , customername, customerpay)"+ "values (? ,? ,?)";
		Connection conn = null;
		int status= 0;
	try {
		conn = datasource.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1,customer.getCustomerid());
		ps.setString(2, customer.getCustomername());
		ps.setDouble(3, customer.getCustomerpay());
		status=ps.executeUpdate();
		ps.close();
	}
		catch (SQLException c){
		throw new RuntimeException(c);
	}finally{
		if(conn != null){
		try {
			conn.close();
			}
		catch (SQLException c) {
		}
		}
	}
	return status;
	
	}
	public Customer FetchCustomer(int custid) {
		String sql = "select * from customer where  customerid=?";
		Connection conn = null;
		int status= 0;
		Customer c =new Customer();
	try {
		conn = datasource.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1,custid);
		ResultSet rs= ps.executeQuery();
		
		while(rs.next()) {
		c.setCustomerid(rs.getInt(1));
		c.setCustomername(rs.getString(2));
		c.setCustomerpay(rs.getDouble(3));
		}
		ps.close();
	}
		catch (SQLException c1){
		throw new RuntimeException(c1);
	}finally{
		if(conn != null){
		try {
			conn.close();
			}
		catch (SQLException c1) {
		}
		}
	}
	return c;
		
	}public int deleteCustomer() {
		String sql = "delete from customer"+"where customer id=?";
		Connection conn = null;
		int status= 0;
	
		Customer c =new Customer();
	try {
		conn = datasource.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(c.getCustomerid(), 1 );
		status = ps.executeUpdate(sql);
	
	}
		catch (SQLException c1){
		throw new RuntimeException(c1);
	}finally{
		if(conn != null){
		try {
			conn.close();
			}
		catch (SQLException c1) {
		}
		}
	}
	return status;
		
	}
	
	
	public DataSource getDatasource() {
		return datasource;
	}
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

}
