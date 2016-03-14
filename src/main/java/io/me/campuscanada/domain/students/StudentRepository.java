package io.me.campuscanada.domain.students;

public interface StudentRepository {
	
	
	
	public Student findById(StudentId studentId);
	
	public void addStudent(Student student);
	
	public void removeStudent(Student student);
	
	public void updateStudent(Student student);
	
	
}
