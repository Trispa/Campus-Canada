package io.me.campuscanada.domain.students;

public class StudentDTO {
	
	public final String firstName;
	public final String lastName;
	public final String email;
	public final StudentId studentId;
	public final StudentAuthSource authSource;
	public final String adress;
	public final String cycle;
	public final String countryOfResidence;
	
	
	public StudentDTO(String firstName, String lastName,String email, StudentId studentId, StudentAuthSource authSource,
			String adress, String cycle, String countryOfResidence) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.studentId = studentId;
		this.authSource = authSource;
		this.adress = adress;
		this.cycle = cycle;
		this.countryOfResidence = countryOfResidence;
	}
}
