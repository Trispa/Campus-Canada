package io.me.campuscanada.domain.students;

public class StudentAuthSource {

	public enum Source {
		FACEBOOK, GOOGLE
	}
	 
	 public Source authSource;
	 public String authId;
	 
	 public StudentAuthSource(){
		 
	 }
	 
	 public StudentAuthSource(Source authSource, String authId) {
			
			this.authSource = authSource;
			this.authId = authId;
		}
	 
	 public boolean equals(StudentAuthSource anotherUserAuthSource) {
			return this.authSource.equals(anotherUserAuthSource.authSource)
				&& this.authId == anotherUserAuthSource.authId;
		    }
}
