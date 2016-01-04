package io.me.campuscanada.domain.Admissions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import io.me.campuscanada.domain.University.University;

@RunWith(MockitoJUnitRunner.class)
public class AdmissionTest {
	
	@Mock
	University university;
	private Admission admission;
	private  AdmissionId admissionId = new AdmissionId(new Long(50));
	private final AdmissionStates STATE = AdmissionStates.OPEN;
	
	@Before
	public void initialise(){
		
		admission = new Admission(admissionId, STATE, university);
	}

	@Test
	public void testGetId() {
		AdmissionId id = admission.getId();
		assertTrue(id.equals(admissionId));
	}

	@Test
	public void testSetId() {
		admission.setId(new AdmissionId(new Long(60)));
		AdmissionId id = admission.getId();
		assertFalse(id.equals(admissionId));
	}

	@Test
	public void testGetStates() {
		AdmissionStates state = admission.getStates();
		assertTrue(state.equals(STATE));
	}
	
	@Test 
	public void givenAnAdmissionWhenOpenAdmissionAdmissionStatueMustBeOPENED(){
		admission.openAdmission();;
		assertTrue(AdmissionStates.OPEN.equals(admission.getStates()));
	}
	@Test 
	public void givenAnAdmissionWhenfinisheAdmissionAdmissionStatueMustBeFINISHED(){
		admission.finisheAdmission();
		assertTrue(AdmissionStates.DONE.equals(admission.getStates()));
	}
	@Test 
	public void givenAnAdmissionWhenCancelAdmissionAdmissionStatueMustBeCANCELED(){
		admission.cancelAdmission();;
		assertTrue(AdmissionStates.CANCELED.equals(admission.getStates()));
	}
}
