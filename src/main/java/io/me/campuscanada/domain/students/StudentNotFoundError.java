package io.me.campuscanada.domain.students;

public class StudentNotFoundError extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public StudentNotFoundError(String message){
		super(message);
	}

}
