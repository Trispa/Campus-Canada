package io.me.campuscanada.domain.School;

public class School {

	
	public static String name;
	private Description description;
	private SchoolType schoolType;
	private String lien;
	
	public School(String name,Description description, SchoolType schoolType,String lien) {
		this.name = name;
		this.description = description;
		this.schoolType = schoolType;
		this.lien = lien;
		
		
	}

	public Description getDescription() {
		return description;
	}
	public SchoolType getSchoolType() {
		return schoolType;
	}

	

	
	
}
