package io.me.campuscanada.domain.Admissions;

import org.joda.time.DateTime;

import io.me.campuscanada.domain.Questionnaires.Questionnaire;
import io.me.campuscanada.domain.School.Programme;
import io.me.campuscanada.domain.School.School;
import io.me.campuscanada.domain.students.Student;
public abstract class Admission implements IAdmission{
	
	protected School school;
	protected AdmissionId id;
	protected DateTime StartDate;
	protected Student owner;
	protected AdmissionProcess admissionProcess;
	protected Questionnaire questionnaire;
	protected Programme programme;
	
	public Admission(School school, AdmissionId id, DateTime startDate, Student owner,
			AdmissionProcess admissionProcess,Questionnaire questionnaire, Programme programme) {
		
		this.school = school;
		this.id = id;
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
		return this.admissionProcess.getStates();
	}
	public void setStates(AdmissionStates states) {
		this.admissionProcess.setStates(states);
	}
	
	public void finisheAdmission(){
		this.admissionProcess.finisheAdmission();
	}
	
	public void openAdmission(){
		this.admissionProcess.openAdmission();
	}
	
	public void cancelAdmission(){
		this.admissionProcess.setStates(AdmissionStates.CANCELED);
	}
	
	public void completQuestionnaire(Questionnaire questionnaire){
		this.admissionProcess.completQuestionnaire();
	}
	
	public void getSchools(){
		this.admissionProcess.getSchool();
	
	}

	public boolean isComplete() {
		return this.admissionProcess.isComplete();
	}
	
	
	
}
