package io.me.campuscanada.domain.Questionnaires;

import java.util.ArrayList;

public class Questionnaire {

	private ArrayList<Question> questionnairelist = null;
	
	
	public Questionnaire(ArrayList<Question> questionnairelist) {
		
		this.questionnairelist = questionnairelist;
	}

	public void  add(Question  q){
		questionnairelist.add(q);
	}
	public Boolean isComplete(){
		
		return false;
	}
}
