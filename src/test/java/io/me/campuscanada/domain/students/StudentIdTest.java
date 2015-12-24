package io.me.campuscanada.domain.students;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StudentIdTest {
	
	static private StudentId studentId ;
	@Before
	public void initialize(){
		studentId = new StudentId(new Long(20));
	}
	@Test
	public void gevenAStudenIdGetIdShouldRetrunExpectedStudentId() {
		Long id = studentId.getId();
		assertTrue(id.equals(studentId.id));
	}

	@Test
	public void gevenAStudenIdSetIdShouldSetTheStudentId() {
		Long id = new Long(7);
		studentId.setId(id);
		assertTrue(id.equals(studentId.id) );
	}

	@Test
	public void givenAnotherstudentIdWhenSameStudenIdEqualShouldReturnTure() {
		StudentId anotherStudentId = new StudentId(new Long(20));
		assertTrue(studentId.equals(anotherStudentId));
		assertTrue(StudentId.NOT_SET.equals(StudentId.NOT_SET));
		
	}
	@Test
	public void givenAnotherstudentIdWhenDifferentStudentIdEqualShouldReturnFalse() {
		StudentId anotherStudentId = new StudentId(new Long(6));
		assertFalse(studentId.equals(anotherStudentId));
		assertFalse(StudentId.NOT_SET.equals(anotherStudentId));
		
		
	}

}
