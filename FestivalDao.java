package com.jdbc.demo.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FestivalDao {
	
	public boolean savedto (FestivalDto dto) {
	 
	Connection fconn= null;

	try {
		
	Class.forName(SQLcon.driverM);
	 
	 fconn = DriverManager.getConnection(SQLcon.url, SQLcon.username, SQLcon.password);
	 
	 System.out.println("connection is success");
	 
	 String query = "insert into festivels values("+dto.getFid()+", '"+dto.getFname()+"', "
	 		+ "'"+dto.getFstate()+"', '"+dto.getFdate()+"')";
	 
	 Statement stm = fconn.createStatement();
	  
	 int rowsaffected = stm.executeUpdate(query);
	 
	 if (rowsaffected == 1) return true;
	 
	}
	
	catch (ClassNotFoundException | SQLException r){
		r.printStackTrace();
	}
		
		finally {
			 try {
			
			if(fconn!=null){
				fconn.close();
			}
		}
			 catch (SQLException s) {
					s.printStackTrace();
				}
		
			}
		return false;
		}
	 //---------
	
	public boolean deleteById(int id) {
	
	Connection	fconn = null;
		
	try {
		Class.forName(SQLcon.driverM);
		
	  fconn = DriverManager.getConnection(SQLcon.url, SQLcon.username, SQLcon.password);
	  
	  System.out.println("connection success");
	  
	  String q = "delete from festivels where fid = " +id;
	  
	  Statement statement= fconn.createStatement();
	  
	  int rowAffected = statement.executeUpdate(q);
	  
	  if (rowAffected == 1) return true;
	  
	}
	
	catch (ClassNotFoundException | SQLException s) {
		s.printStackTrace();
	}
	
	finally {
		try {
		if(fconn != null) {
			fconn.close();
		}

	}
	catch (SQLException s) {
		s.printStackTrace();
	}

}
return false;
}
	
}
