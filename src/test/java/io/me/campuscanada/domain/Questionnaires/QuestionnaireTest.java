package io.me.campuscanada.domain.Questionnaires;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class QuestionnaireTest {
	
	@Mock 
	
	private Questionnaire questionnaire;
	private  ArrayList<Question> questionnairelist;
	private Question question = new Question("quel est votre nationnalité", "senegalaise");
	
	@Before
	public void initialise(){
		questionnaire = new Questionnaire(questionnairelist);
	}

	@Test
	public void givenAQuestionnaireWhenAddQuestionnaireWillContaintOneOrMoreThanOneQuestion() {
		
		assertTrue(questionnairelist.isEmpty());
		
	}

}
