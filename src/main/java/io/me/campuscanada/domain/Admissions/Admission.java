package io.me.campuscanada.domain.Admissions;

import io.me.campuscanada.domain.University.University;

public class Admission {
	
	private University university;
	private AdmissionId id;
	private AdmissionStates state;
	
	
	public Admission(AdmissionId id, AdmissionStates state, University university) {
		this.id = id;
		this.state = state;
		this.university = university;
	}
	public AdmissionId getId() {
		return id;
	}
	public void setId(AdmissionId id) {
		this.id = id;
	}
	public AdmissionStates getStates() {
		return state;
	}
	public void setStates(AdmissionStates states) {
		this.state = states;
	}
	
	public void finisheAdmission(){
		this.setStates(AdmissionStates.DONE);
	}
	
	public void openAdmission(){
		this.setStates(AdmissionStates.OPEN);
	}
	
	public void cancelAdmission(){
		this.setStates(AdmissionStates.CANCELED);
	}
	
	
	
}
