package com.QA.HospitalOOP;

public class Doctor extends Staff {
	
	private int grade;

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public DoctorTitle getTitle() {
		if (this.grade < 3) {
			return DoctorTitle.JUNIOR;	
		} else {
			return DoctorTitle.CONSULTANT;
		}
	}

	public Doctor(String name, int age, String role, int grade) {
		super(name, age, role);
		this.grade = grade;
	}



}
