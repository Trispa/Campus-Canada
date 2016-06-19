package io.me.campuscanada.api.responses;

import io.me.campuscanada.domain.students.StudentAuthSource;

public  class StudentInfo {

	public  final Long id;
	public  final String firstName;
	public  final String lastName;
	public  final String email;
	public  final StudentAuthSource authSource;
	public  final String adress;
	public  final String cycle;
	public  final String countryOfResidence;
	
	public StudentInfo(Long id, String firstName, String lastName, String email, StudentAuthSource authSource,
			String adress, String cycle, String countryOfResidence) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.authSource = authSource;
		this.adress = adress;
		this.cycle = cycle;
		this.countryOfResidence = countryOfResidence;
	}
	
	
}
