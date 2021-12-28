package com.jdbc.demo.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcBeginner {
	
	public static void main(String[] args) {
		
		String driverMn= "com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306";
		String userName="root";
		String password="#1sunita";
		
		
		try{
			
			Class.forName(driverMn);
			
			Connection sqlConn = DriverManager.getConnection(url, userName,password );
			
// connection is interface and its abstract
			if(!sqlConn.isClosed()) {
				System.out.println("connection to db is success");
			}
				
			System.out.println("loading driver ");
			
		String	insertV= "insert into waterfall values(1,'jogfalls' , 'shivamoga' , 835.5 , 'sharavathi' )";
			
			Statement stmt= sqlConn.createStatement(); 
	// statement is interface returned by method and its a abstract implementation for statement will be given by vendor we can use only functionalities
			
		
			
			int noOfRowsEfeected 	= stmt.executeUpdate(insertV);
			
				System.out.println("total number of records executed " +  noOfRowsEfeected);
			
			
		}
		
		
		catch(ClassNotFoundException e){
			System.out.println(e.getMessage());
		}
		
		catch(SQLException sql) {
			sql.printStackTrace();
		}
		
	}

}
