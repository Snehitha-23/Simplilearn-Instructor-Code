package com.jdbc.demo.insert;

import com.jdbc.demo.dao.CustomerDAO;

public class InsertCustomer {

	public static void main(String[] args) {
		
		Customer c1=new Customer(109, "Ramesh", "Bangalore", "M", 22, 1234567892L);
		CustomerDAO dao=new CustomerDAO();
		int c=dao.addCustomer(c1);
		System.out.println(c+" no of customer/s added");
		
	}
	
	
}
//Update(id,contact) and Delete(id)
