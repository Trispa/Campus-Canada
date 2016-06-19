package io.me.campuscanada.api.requests;

import io.me.campuscanada.domain.students.StudentAuthSource;
public class CreateStudentRequest {


	public  String firstName;
	public  String lastName;
	public  String email;
	public  StudentAuthSource authSource;
	public String adress;
	public String cycle;
	public String countryOfResidence;
	

	public CreateStudentRequest (String firstName, String lastName, String email, StudentAuthSource authSource,
			String adress, String cycle, String countryOfResidence) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.authSource = authSource;
		this.adress = adress;
		this.cycle = cycle;
		this.countryOfResidence = countryOfResidence;
	}
	
}
