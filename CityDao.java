package com.jdbc.exam.demo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CityDao {
	
public boolean saveDto(CityDto dto) {
		

		Connection sqlConn = null;
	
	
	try{
		
		Class.forName(Sco.drivermgr);
		
		 sqlConn = DriverManager.getConnection(Sco.url,Sco.username,Sco.password);
		 
			System.out.println("connection to db is success");
		
	String	insertV= "insert into cities value( "+dto.getId()+", '"+dto.getName()+"' , "+dto.getPopulation()+", '"+dto.getFamousfor()+"')";
		
		Statement stmt= sqlConn.createStatement(); 

				int noOfRowsEfeected 	= stmt.executeUpdate(insertV);
		
		System.out.println("total number of records executed " +  noOfRowsEfeected);
			if (noOfRowsEfeected==1) return true;
				
	}
	
	catch(ClassNotFoundException|SQLException sql) {
		sql.printStackTrace();
	}
	
	finally {
		 try {
		
		if(sqlConn!=null){
			sqlConn.close();
		}
	}
		 catch (SQLException s) {
				s.printStackTrace();
			}
	
		}
	return false;
	}
	  
	
	// ---------
	
public boolean deleteById(int id) {
		
		Connection sqlConn = null;
	
	
	try{
		Class.forName(Sco.drivermgr);
		
		 sqlConn = DriverManager.getConnection(Sco.url,Sco.username,Sco.password);
		 	
		
			System.out.println("connection to db is success");
		
	String	insertV= "delete from cities where id = " +id;
	
		Statement stmt= sqlConn.createStatement(); 

				int noOfRowsEfeected 	= stmt.executeUpdate(insertV);
		
		System.out.println("total number of records executed " +  noOfRowsEfeected);
			if (noOfRowsEfeected==1) return true;
				
	}
	
	catch(ClassNotFoundException|SQLException sql) {
		sql.printStackTrace();
	}
	
	finally {
		 try {
		
		if(sqlConn!=null){
			sqlConn.close();
		}
	}
		 catch (SQLException s) {
				s.printStackTrace();
			}
	
		} return false;

}}
