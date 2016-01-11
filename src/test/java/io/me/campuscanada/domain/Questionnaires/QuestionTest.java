package io.me.campuscanada.domain.Questionnaires;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class QuestionTest {
	Question q ;
	Question q1;
	
	@Before
	public void initialise(){
		q = new Question("quelle est votre notionnalité", "Sénégalaise");
		q1 = new Question("quelle est votre notionnalité", "");
	}
	
	@Test
	public void questiontest(){
		q.makeItRequired();
		assertTrue(q.isrequired());
		assertFalse(q1.isrequired());
		q.deleteRequired();
		assertFalse(q.isrequired());
		q.setAnswer("");
		assertTrue(q.getAnswer().equals(""));
	}
}
