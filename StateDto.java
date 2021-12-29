package com.jdbc.exam.demo3;

public class StateDto {
	
	private Integer id;
	 private String name;
	 private Integer code;
	 private String capital;
	 
	 
	 
	 
	public StateDto(Integer id, String name, Integer code, String capital) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.capital = capital;
	}


	public Integer getId() {
		return id;
	}
	
	
	public String getName() {
		return name;
	}
	
	public Integer getCode() {
		return code;
	}
	
	public String getCapital() {
		return capital;
	}


	@Override
	public String toString() {
		return "StateDto [id=" + id + ", name=" + name + ", code=" + code + ", capital=" + capital + "]";
	}
	
	
	 

}
