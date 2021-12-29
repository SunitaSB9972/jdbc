package com.jdbc.exam.demo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class CountryDao {
		
		public boolean saveDto(CountryDto dto) {
			

			Connection sqlConn = null;
		
		
		try{
			
			Class.forName(SQLc.drivermgr);
			
			 sqlConn = DriverManager.getConnection(SQLc.url,SQLc.username,SQLc.password);
			 
				System.out.println("connection to db is success");
			
		String	insertV= "insert into countries value( "+dto.getId()+", '"+dto.getName()+"' , "+dto.getPincode()+", '"+dto.getContinet()+"')";
			
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
			Class.forName(SQLc.drivermgr);
			
			 sqlConn = DriverManager.getConnection(SQLc.url,SQLc.username,SQLc.password);
			 		
			
				System.out.println("connection to db is success");
			
		String	insertV= "delete from countries where id = " +id;
		
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
		}
	      }
			
			


