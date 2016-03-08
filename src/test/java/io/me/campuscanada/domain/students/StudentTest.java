package io.me.campuscanada.domain.students;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StudentTest{
	private Student student;
	private final String firstName = "Toto";
	private final String lastName = "Tata";
	private final String countryOfResidence = "Gambie";
	private final StudentId studentId = new StudentId(new Long(20));

@Before
public void initialise(){
	student = new Student(firstName, lastName, countryOfResidence, studentId);
}

@Test
public void givenAEtudiantGetfirstNameShouldReturnExpectedFirstName(){
	
	String firstname = student.getFirstName(); 
	assertTrue(firstname.equals("Toto"));
}
@Test
public void givenAEtudiantSetfirstNameShouldSetFirstName(){
	
	student.setFirstName("John");
	String firstname = student.getFirstName(); 
	assertTrue(firstname.equals("John"));
}
@Test
public void givenAEtudiantGetlastNameShouldReturnExpectedLastName(){
	
	String lastname = student.getLastName(); 
	assertTrue(lastname.equals("Tata"));
}

@Test
public void givenAEtudiantSetlastNameShouldSetLastName(){
	
	student.setLastName("Smith");
	String lastname = student.getLastName(); 
	assertTrue(lastname.equals("Smith"));
}

@Test
public void givenAEtudiantGetcountryOfResidenceShouldReturnExpectedcountryOfResidence(){
	
	String country = student.getCountryOfResidence(); 
	assertTrue(country.equals("Gambie"));
}

@Test
public void givenAEtudiantSetcountryOfResidenceShouldSetcountryOfResidence(){
	
	student.setCountryOfResidence("Senegal");
	String country = student.getCountryOfResidence(); 
	assertTrue(country.equals("Senegal"));
}

@Test
public void givenAEtudiantgetStudentIdShouldReturnExpectedgetStudentId(){
	
	StudentId id = student.getStudentId(); 
	assertTrue(id.equals(studentId));
}

@Test
public void givenAEtudiantSetStudentIdShouldSetStudentId(){
	
	StudentId Id = new StudentId(new Long(10));
	student.setStudentId(Id); 
	StudentId studentId =student. getStudentId(); 
	assertTrue(studentId.equals(Id));
}



}


