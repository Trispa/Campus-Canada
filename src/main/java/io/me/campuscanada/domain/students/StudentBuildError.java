package io.me.campuscanada.domain.students;

public class StudentBuildError extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public StudentBuildError(String message){
		super(message);
	}

}
