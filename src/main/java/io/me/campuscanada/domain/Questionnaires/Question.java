package io.me.campuscanada.domain.Questionnaires;

public class Question {

	private String question;
	private String answer;
	private  Boolean required;
	
	
	
	public Question() {
		
	}
	public Question(String question, String answer) {
		this.question = question;
		this.answer = answer;
		this.required = false;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public void  deleteRequired() {
		this.required = false;
	}
	public void makeItRequired() {
		this.required = true;
	}
	public Boolean isrequired(){
		return this.required;
	}
	
	
	
}
