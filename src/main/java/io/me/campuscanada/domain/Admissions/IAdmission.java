package io.me.campuscanada.domain.Admissions;

import io.me.campuscanada.domain.Questionnaires.Question;
import io.me.campuscanada.domain.Questionnaires.Questionnaire;
import io.me.campuscanada.domain.School.School;

public interface IAdmission {
	public void finisheAdmission();
	
	public void openAdmission();
	
	public void cancelAdmission();
	
	public void completQuestionnaire(Questionnaire questionnaire);
	

	public School getSchools();
	
	public  boolean isComplet();
}
