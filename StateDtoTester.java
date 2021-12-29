package com.jdbc.exam.demo3;

public class StateDtoTester {

	public static void main(String[] args) {
		
			
		StateDto  f= new StateDto(3,"karnataka" , 16 , "bangalore" );
			System.out.println(f);
			
			StateDao dao= new StateDao();
			boolean saved=dao.saveDto(f);
			
			System.out.println(saved);

	dao.deleteById(3);

	}

}
