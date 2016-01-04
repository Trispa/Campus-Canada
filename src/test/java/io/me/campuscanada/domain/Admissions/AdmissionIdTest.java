package io.me.campuscanada.domain.Admissions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import io.me.campuscanada.domain.students.StudentId;

@RunWith(MockitoJUnitRunner.class)
public class AdmissionIdTest {
	
	static private AdmissionId admissionId;
	
	@Before
	public void initialize(){
		admissionId = new AdmissionId(new Long(30));
	}

	@Test
	public void givenAnotherAdmissionIdWhenSameAdmissionIdEqualShouldReturnTrue() {
		
		AdmissionId anotherAdmissionId = new AdmissionId(new Long(30));
		assertTrue(admissionId.equals(anotherAdmissionId));
		assertTrue(AdmissionId.NOT_SET.equals(new AdmissionId(null)));
	
		
	}
	
	@Test
	public void givenAnotherAdmissionIdWhenDifferentAdmissionIdEqualShouldReturnFalse() {
		AdmissionId anotherAdmissionId =  new AdmissionId(new Long(40));
		assertFalse(admissionId.equals(anotherAdmissionId));
		assertFalse(AdmissionId.NOT_SET.equals(anotherAdmissionId));
		
	}
	
	@Test
	public void givenAnAdmissionIdWhenGetIdShouldGetExpectedId() {
		Long id = admissionId.getId();
		assertTrue(id.equals(admissionId.id));
	}

	@Test
	public void givenAnAdmissionIdWhenSetIdShouldSetAdmissionIdWithExpectedId() {
		admissionId.setId(new Long(10));
		Long id = new Long(10);
		assertTrue(id.equals(admissionId.id));
	}
	
	

}
