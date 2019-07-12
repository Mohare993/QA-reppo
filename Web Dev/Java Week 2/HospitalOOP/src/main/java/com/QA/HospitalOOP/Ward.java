package com.QA.HospitalOOP;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ward {

	private String name;
	private int numOFBeds;
	private List<Patient> beds = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOFBeds() {
		return numOFBeds;
	}

	public void setNumOFBeds(int numOFBeds) {
		this.numOFBeds = numOFBeds;
	}

	public List<Patient> getBeds() {
		return beds;
	}

	public void setBeds(List<Patient> beds) {
		this.beds = beds;
	}

	public void addPatient(Patient Patient)  {
		if (this.beds.size() < numOFBeds) {
		   this.beds.add(Patient);
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public boolean removePatient(Patient beds) {
		return this.beds.remove(beds);

	}

	public Ward(String name, int numOFBeds) {
		super();
		this.name = name;
		this.numOFBeds = numOFBeds;
	}

	@Override
	public String toString() {
		return "Ward [name=" + name + ", numOFBeds=" + numOFBeds + ", beds=" + beds + "]";
	}

}
