package com.QA.HospitalOOP;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	
	private List<Patient> patients = new ArrayList<>();
	private List<Staff> staff = new ArrayList<>();
	private List<Ward> wards = new ArrayList<>();
	private List<Team> teams = new ArrayList<>();
	
	
	public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	public List<Staff> getStaff() {
		return staff;
	}
	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}
	public List<Ward> getWards() {
		return wards;
	}
	public void setWards(List<Ward> wards) {
		this.wards = wards;
	}
	public List<Team> getTeams() {
		return teams;
	}
	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
	

	
	
	public boolean createPatient(String name, int age, Ward ward) {
		Patient patient = new Patient(name, age);
		ward.addPatient(patient);
		return this.patients.add(patient);
		
	}
	
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	

}
