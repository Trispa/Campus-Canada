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
	private final String email = "campusCananda@gmail.com";
	private final String countryOfResidence = "Gambie";
	private final StudentId studentId = new StudentId(new Long(20));
	private final String adress = "2325, ";
	private final String cycle = "Toto";
	private final StudentAuthSource authSource = new StudentAuthSource(StudentAuthSource.Source.FACEBOOK, "2016f6");
	
@Before
public void initialise(){
	student = new Student.StudentBuilder(firstName, lastName,email, authSource)
			.countryOfResidence(countryOfResidence)
			.adress(adress)
			.cycle(cycle)
			.studentId(studentId)
			.build();
}

@Test
public void givenAEtudiantGetfirstNameShouldReturnExpectedFirstName(){
	
	String firstname = student.getFirstName(); 
	assertTrue(firstname.equals("Toto"));
}

@Test
public void givenAEtudiantGetlastNameShouldReturnExpectedLastName(){
	
	String lastname = student.getLastName(); 
	assertTrue(lastname.equals("Tata"));
}



@Test
public void givenAEtudiantGetcountryOfResidenceShouldReturnExpectedcountryOfResidence(){
	
	String country = student.getCountryOfResidence(); 
	assertTrue(country.equals("Gambie"));
}



@Test
public void givenAEtudiantgetStudentIdShouldReturnExpectedStudentId(){
	
	StudentId id = student.getStudentId(); 
	assertTrue(id.equals(studentId));
}

@Test
public void givenAEtudiantgetAdressShouldReturnExpectedAdress(){
	String add = student.getAdress(); 
	assertTrue(add.equals(adress));
	
}


@Test
public void givenAEtudiantgetCycleShouldReturnExpectedgCycle(){
	
	String c = student.getCycle(); 
	assertTrue(c.equals(cycle));
}

@Test
public void givenAEtudiantgetauthSourceShouldReturnExpectedgetAuthSource(){
	
	StudentAuthSource auth = student.getAuthSource(); 
	assertTrue(auth.equals(authSource));
}




}


