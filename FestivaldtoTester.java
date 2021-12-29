package com.jdbc.demo.java;

public class FestivaldtoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
		FestivalDto  water= new FestivalDto(4, "dussera", "2021-10-10", "india");
		System.out.println(water);
				
				
		
		 FestivalDao dao = new FestivalDao();
		  
		 boolean saved = dao.savedto(water);
				 
				 System.out.println (saved);
		 
				 dao.deleteById(3);
		 
	}

}
