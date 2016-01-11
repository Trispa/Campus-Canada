package io.me.campuscanada.domain.Questionnaires;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class QuestionnaireTest {
	
	 
	private Questionnaire questionnaire;
	private  ArrayList<Question> questionnairelist = new ArrayList<Question>();
	@Mock
	private Question question;
	@Mock
	private Question question1;
	@Before
	public void initialise(){
		questionnaire = new Questionnaire(questionnairelist);
	}

	@Test
	public void givenAQuestionnaireWhenAddQuestionnaireWillContaintOneOrMoreThanOneQuestion() {
		
		assertTrue(questionnairelist.isEmpty());
		questionnaire.add(question);
		assertFalse(questionnairelist.isEmpty());
		
	}
	
	@Test
	public void givenAnAdmissionWhenAllRequiredQuestionsAreCompletedIsCompletShouldReturnTrue(){
		Mockito.when(question.isrequired()).thenReturn(true);
		Mockito.when(question1.isrequired()).thenReturn(true);
		Mockito.when(question.getAnswer()).thenReturn("test");
		Mockito.when(question1.getAnswer()).thenReturn("test");
		assertTrue(question.isrequired());
		assertTrue(question1.isrequired());
		questionnaire.add(question);
		questionnaire.add(question1);
		assertTrue(questionnaire.isComplete());
		
	}
	@Test
	public void givenAnAdmissionWhenOneRequiredQuestionsAreCompletedIsCompletShouldReturnFalse(){
		
		Mockito.when(question.isrequired()).thenReturn(true);
		Mockito.when(question1.isrequired()).thenReturn(true);
		Mockito.when(question1.getAnswer()).thenReturn("");
		questionnaire.add(question);
		questionnaire.add(question1);
		assertFalse(questionnaire.isComplete());
	}

	@Test
	public void questiontest(){
		Question q = new Question("quelle est votre notionnalité", "Sénégalaise");
		Question q1 = new Question("quelle est votre notionnalité", "");
		q.makeItRequired();
		assertTrue(q.isrequired());
		assertFalse(q1.isrequired());
		
	}
}
