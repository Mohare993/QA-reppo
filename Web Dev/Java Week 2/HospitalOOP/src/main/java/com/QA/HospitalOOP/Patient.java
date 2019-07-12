package com.QA.HospitalOOP;

import java.util.ArrayList;
import java.util.List;


public class Patient extends Person {
	
	private int id;
	
	private static int counter;

	private List<String> treatmentPlan = new ArrayList<String>();
	
	
	public int getId() {
		return id;
	}
	
	public static int getNextId() { 
	    return ++counter; }
	
	
	public List<String> getTreatmentPlan() {
		return treatmentPlan;
	}
	public void setTreatmentPlan(List<String> treatmentPlan) {
		this.treatmentPlan = treatmentPlan;
	}
	
	public Patient(String name, int age) {
		super(name, age);
		this.id = getNextId(); 
		
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Patient = [id=" + id + ", treatmentPlan=" + treatmentPlan + ", Name=" + getName() + ", Age="
				+ getAge() + "]";
	}



}
