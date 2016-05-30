package io.me.campuscanada.persistance.students;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;

import io.me.campuscanada.domain.students.StudentAuthSource;
import io.me.campuscanada.domain.students.StudentId;

import com.googlecode.objectify.annotation.Id;

@Entity
public class StudentEntity {

	@Id
	public Long Id;
	@Index
	public String authSource;
	@Index
	public String authId;
	public String firstName;
	public String lastName;
	public String adress;
	public String cycle;
	public String countryOfResidence;

	public StudentEntity() {

	}


	public StudentEntity(Long id, String authSource, String authId, String firstName, String lastName, String adress,
			String cycle, String countryOfResidence) {
		Id = id;
		this.authSource = authSource;
		this.authId = authId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.adress = adress;
		this.cycle = cycle;
		this.countryOfResidence = countryOfResidence;
	}
	
}
