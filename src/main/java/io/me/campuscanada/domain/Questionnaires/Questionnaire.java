package io.me.campuscanada.domain.Questionnaires;

import java.util.ArrayList;

public class Questionnaire {

	private ArrayList<Question> questionnairelist;
	
	
	public Questionnaire(ArrayList<Question> questionnairelist) {
		
		this.questionnairelist = questionnairelist;
		
	}
	public void  add(Question  question){
		questionnairelist.add(question);
	}
	public Boolean isComplete(){
		for(Question question :questionnairelist){
			String answer = question.getAnswer();
			if(answer == ""){
				if(question.isrequired())
				return false;	
			}
			
		}
		return true;
	}
	

}
