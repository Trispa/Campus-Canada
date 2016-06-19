package io.me.campuscanada.domain.School;

public class School {

	
	private String name;
	private Description description;
	private SchoolType schoolType;
	private String lien;
	
	public School(String name,Description description, SchoolType schoolType,String lien) {
		this.name = name;
		this.description = description;
		this.schoolType = schoolType;
		this.lien = lien;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLien() {
		return lien;
	}

	public void setLien(String lien) {
		this.lien = lien;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public void setSchoolType(SchoolType schoolType) {
		this.schoolType = schoolType;
	}

	public Description getDescription() {
		return description;
	}
	public SchoolType getSchoolType() {
		return schoolType;
	}

	

	
	
}
