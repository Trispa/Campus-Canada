package io.me.campuscanada.domain.Admissions;

import org.joda.time.DateTime;

import io.me.campuscanada.domain.Questionnaires.Questionnaire;
import io.me.campuscanada.domain.School.Programme;
import io.me.campuscanada.domain.School.School;
import io.me.campuscanada.domain.students.Student;
public abstract class Admission implements IAdmission{
	
	protected School school;
	protected AdmissionId id;
	protected AdmissionStates state;
	protected DateTime StartDate;
	protected Student owner;
	protected AdmissionProcess admissionProcess;
	protected Questionnaire questionnaire;
	protected Programme programme;
	
	public Admission(School school, AdmissionId id, AdmissionStates state, DateTime startDate, Student owner,
			AdmissionProcess admissionProcess,Questionnaire questionnaire, Programme programme) {
		
		this.school = school;
		this.id = id;
		this.state = state;
		this.StartDate = startDate;
		this.owner = owner;
		this.admissionProcess = admissionProcess;
		this.questionnaire = questionnaire;
		this.programme = programme;
		
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
	
	public void completQuestionnaire(Questionnaire questionnaire){
		this.questionnaire.isComplete();
	}
	
	public void getSchools(){
		this.admissionProcess.getSchools();
	
	}
	
	public  boolean isComplet(){
		return false;
	}
	
	
	
}
