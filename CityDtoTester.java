package com.jdbc.exam.demo3;

public class CityDtoTester {

	public static void main(String[] args) {
		CityDto  f= new CityDto(3, "bengalore" , 40880000.0 , "silicon valley" );
		System.out.println(f);
		
		CityDao dao= new CityDao();
		boolean saved=dao.saveDto(f);
		
		System.out.println(saved);

dao.deleteById(3);

	}

}
