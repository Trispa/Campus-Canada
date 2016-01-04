package io.me.campuscanada.domain.students;


public class StudentId {
	public  Long id;
	public static final StudentId NOT_SET = new StudentId(null);
	public StudentId (Long id){
		this.id =id;
	}
	
	public StudentId (){
		
	}
	public Long getId(){
		return this.id;
	}
 
	public void setId(Long id){
		this.id = id;
	}
	
	public boolean equals(StudentId anotherStudentId){
		if(this.id == null && anotherStudentId.id == null){
			return true;
		}
		if (this.id != null){
			return this.id.equals(anotherStudentId.id);
		}
		return false;
			
	}
	
}
