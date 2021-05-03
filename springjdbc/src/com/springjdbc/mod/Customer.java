package com.springjdbc.mod;

public class Customer {
	private int Customerid;
	private String customername;
	private double customerpay;
	
	public static void main(String[] args) {
		
	}

	public int getCustomerid() {
		return Customerid;
	}

	public void setCustomerid(int customerid) {
		Customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public double getCustomerpay() {
		return customerpay;
	}

	public void setCustomerpay(double customerpay) {
		this.customerpay = customerpay;
	}

	@Override
	public String toString() {
		return "Customer [Customerid=" + Customerid + ", customername=" + customername + ", customerpay=" + customerpay
				+ "]";
	}
	

}
