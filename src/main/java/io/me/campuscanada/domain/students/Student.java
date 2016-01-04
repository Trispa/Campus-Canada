package io.me.campuscanada.domain.students;

public class Student {
	
	
	private String firstName;
	private String lastName;
	private String countryOfResidence;
	private StudentId studentId;
	
 public Student(String firstName, String lastName, String countryOfResidence, StudentId studentId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.countryOfResidence = countryOfResidence;
		this.studentId = studentId;
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
	
	public StudentId getStudentId(){
		return this.studentId;
	}
	
	public void setStudentId(StudentId studentId){
		this.studentId = studentId;
	}
}
