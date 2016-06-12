package io.me.campuscanada.persistance.students;


public class StudentEntity  {

	public Long Id;
	public String authSource;
	public String authId;
	public String firstName;
	public String lastName;
	public String email;
	public String adress;
	public String cycle;
	public String countryOfResidence;

	public StudentEntity() {

	}
	public StudentEntity(Long id, String authSource, String authId, String firstName,String email,String lastName, String adress,
			String cycle, String countryOfResidence) {
		Id = id;
		this.authSource = authSource;
		this.authId = authId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.adress = adress;
		this.cycle = cycle;
		this.countryOfResidence = countryOfResidence;
	}
	
}
