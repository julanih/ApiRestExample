package com.julanih.demo.dto;

import java.math.BigDecimal;

public class UserDTO {
	
	private Integer iddto;
	private String namedto;
	private String emaildto;
	private BigDecimal salarydto;
	private boolean activedto;
	private int agedto;
	
	public UserDTO() {
		// Default constructor
	}

	public Integer getIddto() {
		return iddto;
	}

	public void setIddto(Integer id) {
		this.iddto = id;
	}

	public String getNamedto() {
		return namedto;
	}

	public void setNamedto(String name) {
		this.namedto = name;
	}

	public String getEmaildto() {
		return emaildto;
	}

	public void setEmaildto(String email) {
		this.emaildto = email;
	}

	public BigDecimal getSalarydto() {
		return salarydto;
	}

	public void setSalarydto(BigDecimal salary) {
		this.salarydto = salary;
	}

	public boolean isActivedto() {
		return activedto;
	}

	public void setActivedto(boolean active) {
		this.activedto = active;
	}

	public int getAgedto() {
		return agedto;
	}

	public void setAgedto(int age) {
		this.agedto = age;
	}
}
