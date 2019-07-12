package com.QA.HospitalOOP;

public abstract class Staff extends Person {
	
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Staff(String name, int age, String role) {
		super(name, age);
		this.role = role;
	}
	

}
