package com.jdbc.exam.demo3;

public class CountryDto {
	
	 private Integer id;
	 private String name;
	 private Integer pincode;
	 private String continet;
	 
	 
	public CountryDto(Integer id, String name, Integer pincode, String continet) {
		super();
		this.id = id;
		this.name = name;
		this.pincode = pincode;
		this.continet = continet;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Integer getPincode() {
		return pincode;
	}
	public String getContinet() {
		return continet;
	}
	@Override
	public String toString() {
		return "CountryDto [id=" + id + ", name=" + name + ", pincode=" + pincode + ", continet=" + continet + "]";
	}
	
	
	
	
	 
	 

}
