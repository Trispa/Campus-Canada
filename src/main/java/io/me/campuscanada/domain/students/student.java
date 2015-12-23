package io.me.campuscanada.domain.students;

public class student {
	
	
	private String firstName;
	private String lastName;
	private String countryOfResidence;
	
 public student(String firstName, String lastName, String countryOfResidence) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.countryOfResidence = countryOfResidence;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountryOfResidence() {
		return countryOfResidence;
	}

	public void setCountryOfResidence(String countryOfResidence) {
		this.countryOfResidence = countryOfResidence;
	}
}
