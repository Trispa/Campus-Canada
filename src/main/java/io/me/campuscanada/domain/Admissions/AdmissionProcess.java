package io.me.campuscanada.domain.Admissions;

import java.util.ArrayList;

import io.me.campuscanada.domain.Questionnaires.Questionnaire;
import io.me.campuscanada.domain.School.School;

public class AdmissionProcess {

	private  AdmissionStates state;
	private School  school;
	private Questionnaire questionnaire;
	
	
	public AdmissionProcess(AdmissionStates state,School  school,Questionnaire questionnaire ){
		this.school = school;
		this.state = state;
		this.questionnaire  = questionnaire;
		
	}
	
	public School getSchool(){
		return this.school;
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
	
	public void completQuestionnaire(){
		this.questionnaire.isComplete();
	}
	
	public  boolean isComplete(){
		return false;
	}
}
