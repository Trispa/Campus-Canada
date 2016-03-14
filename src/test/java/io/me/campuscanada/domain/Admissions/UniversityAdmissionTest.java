package io.me.campuscanada.domain.Admissions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import org.joda.time.DateTime;

import io.me.campuscanada.domain.Admissions.Exceptions.BadSchoolExcpetion;
import io.me.campuscanada.domain.Questionnaires.Questionnaire;
import io.me.campuscanada.domain.School.Cycle;
import io.me.campuscanada.domain.School.Programme;
import io.me.campuscanada.domain.School.School;
import io.me.campuscanada.domain.School.SchoolType;
import io.me.campuscanada.domain.students.Student;

@RunWith(MockitoJUnitRunner.class)
public class UniversityAdmissionTest {
	
	@Mock
	private School school;
	@Mock
	private Student owner;
	@Mock
	private Questionnaire questionnaire;
	@Mock
	private AdmissionProcess admissionProcess;
	private UniversityAdmission universityAdmission;
	private  AdmissionId admissionId = new AdmissionId(new Long(50));
	private final AdmissionStates STATE = AdmissionStates.OPEN;
	private DateTime startDate = new DateTime("2011-12-02");
	private Programme programme = new Programme(Cycle.FIRST,"Génie Informatique", "Programme ingenieur");
	
	
	@Before
	public void initialise(){
		universityAdmission = new UniversityAdmission(school, admissionId, STATE, startDate, owner, admissionProcess, questionnaire, programme);
	}
	
	@Test
	public void testGetId() {
		AdmissionId id = universityAdmission.getId();
		assertTrue(id.equals(admissionId));
	}

	@Test
	public void testSetId() {
		universityAdmission.setId(new AdmissionId(new Long(60)));
		AdmissionId id = universityAdmission.getId();
		assertFalse(id.equals(admissionId));
	}

	@Test
	public void testGetStates() {
		AdmissionStates state = universityAdmission.getStates();
		assertTrue(state.equals(STATE));
	}
	
	@Test 
	public void givenAnAdmissionWhenOpenAdmissionAdmissionStatueMustBeOPENED(){
		universityAdmission.openAdmission();;
		assertTrue(AdmissionStates.OPEN.equals(universityAdmission.getStates()));
	}
	@Test 
	public void givenAnAdmissionWhenfinisheAdmissionAdmissionStatueMustBeFINISHED(){
		universityAdmission.finisheAdmission();
		assertTrue(AdmissionStates.DONE.equals(universityAdmission.getStates()));
	}
	@Test 
	public void givenAnAdmissionWhenCancelAdmissionAdmissionStatueMustBeCANCELED(){
		universityAdmission.cancelAdmission();;
		assertTrue(AdmissionStates.CANCELED.equals(universityAdmission.getStates()));
	}
	
	@Test(expected=BadSchoolExcpetion.class)
	public void givenAnUniversityAdmissionWhenNotAnUniversityAssertThatIsAnUniversityShouldRaiseAnSchoolExcpetion(){
		Mockito.when(school.getSchoolType()).thenReturn(SchoolType.COLLEGE);
		assertFalse(universityAdmission.IsAnUniversity());
		universityAdmission.assertThatIsAnUniversity();
		
		
	}
	@Test
	public void givenAnUniversityAdmissionWhenAnUniversityAssertThatIsAnUniversityShouldNotRaiseAnSchoolExcpetion(){
		Mockito.when(school.getSchoolType()).thenReturn(SchoolType.UNIVERSITY);
		assertTrue(universityAdmission.IsAnUniversity());
		universityAdmission.assertThatIsAnUniversity();
		
		
	}
	@Test
	public void givenAnAdmissionWhenQuestionnaireIsCompletedCompletQuestionnaireShouldCallIsCompletFunctionofQuestionaire(){
		
		this.universityAdmission.completQuestionnaire(questionnaire);
		Mockito.verify(this.questionnaire, Mockito.times(1)).isComplete();
	}
	
	@Test 
	public void givenAnAdmissionAfterCompletAdmissionGetShoolShouldCallGetSchoolToAdmissionProcess(){
		this.universityAdmission.getSchools();
		Mockito.verify(this.admissionProcess, Mockito.times(1)).getSchools();
		
	}
}
