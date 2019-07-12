package com.QA.HospitalOOP;

import java.util.ArrayList;
import java.util.List;

public class Team {
	
		private String name;
		
		private List<Person> team = new ArrayList<>();
		
		
		public List<Person> getTeam() {
			return team;
		}

		public void setTeam(List<Person> team) {
			this.team = team;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
		
		
		public boolean addStaff(Staff staff) {
			if () {
				return this.team.add(staff);
			} else {
				System.out.println("This ward is FULL!!");
				return false;

			}
		}

		public boolean removeStaff(Staff staff) {
			return this.team.remove(staff);
		}
}
