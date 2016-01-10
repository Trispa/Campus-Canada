package io.me.campuscanada.domain.School;

public class School {

	
	public static String name;
	private Description description;
	private SchoolType schoolType;
	
	public School(String name,Description description, SchoolType schoolType) {
		this.name = name;
		this.description = description;
		this.schoolType = schoolType;
		
	}

	public Description getDescription() {
		return description;
	}
	public SchoolType getSchoolType() {
		return schoolType;
	}

	

	
	
}
