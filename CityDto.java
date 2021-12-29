package com.jdbc.exam.demo3;

public class CityDto {
	
	 private Integer id;
	 private String name;
	 private Double population;
	 private String famousfor;
	 
	public CityDto(Integer id, String name, Double population, String famousfor) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
		this.famousfor = famousfor;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getPopulation() {
		return population;
	}

	public String getFamousfor() {
		return famousfor;
	}

	@Override
	public String toString() {
		return "CityDto [id=" + id + ", name=" + name + ", population=" + population + ", famousfor=" + famousfor + "]";
	}

	
	 

}
