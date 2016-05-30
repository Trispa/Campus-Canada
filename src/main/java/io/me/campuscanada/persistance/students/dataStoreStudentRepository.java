package io.me.campuscanada.persistance.students;

import io.me.campuscanada.domain.students.Student;
import io.me.campuscanada.domain.students.StudentDTO;
import io.me.campuscanada.domain.students.StudentId;
import io.me.campuscanada.domain.students.StudentNotFoundError;
import io.me.campuscanada.domain.students.StudentRepository;
import io.me.campuscanada.persistance.transformers.StudentDTOTransformer;

import com.google.inject.Inject;
import com.googlecode.objectify.Key; 
public class dataStoreStudentRepository  implements StudentRepository {

	private StudentDTOTransformer transformer;
	
	@Inject
	public dataStoreStudentRepository(StudentDTOTransformer transformer) {
		this.transformer = transformer;
		
	}
	
	
	
	@Override
	public Student findById(StudentId studentId) {
		
		StudentEntity studentEntity = loadEntityFromDataBase(studentId.id);
		if(studentEntity == null){
			String message = String.format("Cet étudiant n'éxiste pas", studentId.id);
			throw  new StudentNotFoundError(message);
			
		}
		
		StudentDTO  studentDTO = this.transformer.toDto(studentEntity);
		return  new Student.StudentBuilder(studentDTO.firstName, studentDTO.lastName, studentDTO.studentId, studentDTO.authSource)
				.countryOfResidence(studentDTO.countryOfResidence)
				.adress(studentDTO.adress)
				.cycle(studentDTO.cycle)
				.build();
	}
	private StudentEntity loadEntityFromDataBase(Long id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}
	
	
}
