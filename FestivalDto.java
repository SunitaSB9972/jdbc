package com.jdbc.demo.java;

public class FestivalDto {
	
	private Integer fid;
	private String fname;
	private String fdate;
	private String fstate;
	
	
	public FestivalDto() {
	
	}
	
	public FestivalDto(Integer fid, String fname, String fdate, String fstate) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.fdate = fdate;
		this.fstate = fstate;
	}

	public Integer getFid() {
		return fid;
	}
	
		public String getFname() {
		return fname;
	}
	
	public String getFdate() {
		return fdate;
	}
	
	public String getFstate() {
		return fstate;
	}

	@Override
	public String toString() {
		return "FestivalDto [fid=" + fid + ", fname=" + fname + ", fdate=" + fdate + ", fstate=" + fstate + "]";
	}
	 

}
