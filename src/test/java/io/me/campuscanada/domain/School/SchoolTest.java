package io.me.campuscanada.domain.School;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import io.me.campuscanada.domain.School.Description;
import io.me.campuscanada.domain.School.School;
@RunWith(MockitoJUnitRunner.class)
public class SchoolTest {
	public static String name = "Université Laval";
	private School school;
	private SchoolType schoolType = SchoolType.UNIVERSITY;
	private String lien = "www.ulaval.ca";
	@Mock
	private Description description;
	
	
	@Before
	public void initialise(){
		school = new School(name, description,schoolType, lien);
		}
	
	@Test
	public void testGetName() {
		assertTrue(school.getName().equals(name));
	}
	
	@Test
	public void testGetDescription() {
		assertTrue(school.getDescription().equals(description));
	}
	
}
