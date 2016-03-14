package io.me.campuscanada.domain.Admissions;

import org.joda.time.DateTime;

import io.me.campuscanada.domain.Admissions.Exceptions.BadSchoolExcpetion;
import io.me.campuscanada.domain.Questionnaires.Questionnaire;
import io.me.campuscanada.domain.School.Programme;
import io.me.campuscanada.domain.School.School;
import io.me.campuscanada.domain.School.SchoolType;
import io.me.campuscanada.domain.students.Student;

public class UniversityAdmission extends Admission {

	
	public UniversityAdmission(School school, AdmissionId id, AdmissionStates state, DateTime startDate, Student owner,
			AdmissionProcess admissionProcess, Questionnaire questionnaire, Programme programme) {
		super(school, id, state, startDate, owner, admissionProcess, questionnaire, programme);
		
	}
	public Boolean IsAnUniversity(){
		
		return this.school.getSchoolType() == SchoolType.UNIVERSITY;
	}
	public void assertThatIsAnUniversity(){

		if(!IsAnUniversity()){
			throw new BadSchoolExcpetion("is not an University");
		}
	}

	
}
