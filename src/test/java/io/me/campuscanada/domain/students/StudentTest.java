package io.me.campuscanada.domain.students;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import io.me.campuscanada.domain.students.student;

@RunWith(MockitoJUnitRunner.class)
public class StudentTest{
	
	private student etudiant;
	private final String firstName = "Toto";
	private final String lastName = "Tata";
	private final String countryOfResidence = "Gambie";


@Before
public void initialise(){
	
	etudiant = new student(firstName, lastName, countryOfResidence);
}

@Test
public void givenAEtudiantGetfirstNameShouldReturnExpectedFirstName(){
	
	String firstname = etudiant.getFirstName();
	assertTrue(firstname == "Toto");
}

}
