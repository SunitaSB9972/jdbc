package com.jdbc.exam.demo3;


public class CountryDtoTester {

	public static void main(String[] args) {
		
		CountryDto  f= new CountryDto(3,"irak" , 12 , "austrelia" );
		System.out.println(f);
		
		CountryDao dao= new CountryDao();
		boolean saved=dao.saveDto(f);
		
		System.out.println(saved);

dao.deleteById(2);

	}

}
