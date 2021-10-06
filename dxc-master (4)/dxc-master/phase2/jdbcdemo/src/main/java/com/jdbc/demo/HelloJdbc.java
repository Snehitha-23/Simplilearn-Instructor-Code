package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJdbc {

	public static void main(String[] args) {
	
		Connection connection=null;
		
		try {
			//Step1
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			
			//Step2
			String url="jdbc:mysql://localhost:3306/dxc";
			String username="root";
			String password="root";
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("Connection Successful");
			
			//Step3
			Statement statement=connection.createStatement();
			String sql="select id,name,age,city,gender,contact from customer";
			
			//Step4
			ResultSet resultSet=statement.executeQuery(sql);
			System.out.println("Query executed");
			
			//Step5
			System.out.println("\nCustomer Details are : ");
			while(resultSet.next()) {
				System.out.print("Id - "+resultSet.getInt("id")+" Name - "+resultSet.getString("name"));
				System.out.print(" Age - "+resultSet.getInt("age") );
				System.out.print(" Contact - "+resultSet.getLong("contact"));
				System.out.print(" Gender - "+resultSet.getString("gender"));
				System.out.println(" City - "+resultSet.getString("city"));
			}
			System.out.println("Results Processed");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step6
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}

}
