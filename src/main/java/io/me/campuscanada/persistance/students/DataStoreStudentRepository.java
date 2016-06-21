package io.me.campuscanada.persistance.students;
import io.me.campuscanada.domain.students.Student;
import io.me.campuscanada.domain.students.StudentDTO;
import io.me.campuscanada.domain.students.StudentId;
import io.me.campuscanada.domain.students.StudentNotFoundError;
import io.me.campuscanada.domain.students.StudentRepository;
import io.me.campuscanada.persistance.transformers.StudentDTOTransformer;

import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;
import com.google.cloud.datastore.Entity;
import com.google.cloud.datastore.Key;
import com.google.cloud.datastore.KeyFactory;
import com.google.inject.Inject;
public class DataStoreStudentRepository  implements StudentRepository {

	private StudentDTOTransformer transformer;

	Datastore datastore ;
	private DataStoreServices dataStoreServices = new DataStoreServices(datastore);
	
	@Inject
	public DataStoreStudentRepository(StudentDTOTransformer transformer, DataStoreServices dataStoreServices, Datastore datastore ) {
		this.transformer = transformer;
		this.dataStoreServices = dataStoreServices;
		this.datastore = datastore;
		
	}
	
	
	
	
	public Student findById(StudentId studentId) {
		
		String id =Long.toString(studentId.id);
		Entity entity = loadEntityFromDataBase(id, "Student");
		if(entity == null){
			String message = String.format("Cet �tudiant n'�xiste pas", studentId.id);
			throw  new StudentNotFoundError(message);
			
		}
		
		StudentDTO  studentDTO = this.transformer.toDto(entity);
		return  new Student.StudentBuilder(studentDTO.firstName, studentDTO.lastName,studentDTO.email, studentDTO.authSource)
				.countryOfResidence(studentDTO.countryOfResidence)
				.adress(studentDTO.adress)
				.cycle(studentDTO.cycle)
				.studentId(studentDTO.studentId)
				.build();
	}
	
	private Entity loadEntityFromDataBase(String id, String kind) {
		KeyFactory keyFactory = datastore.newKeyFactory().kind(kind);
    	Key key = keyFactory.newKey(id);
    	return dataStoreServices.getEntity(key);
		
	}



	
	public void addStudent(Student student) {
		StudentDTO studentDTO= student.getDTO();
		Entity  entity  = transformer.toEntity(studentDTO);
		dataStoreServices.addEntity(entity);
		student.setStudentId(new StudentId(entity.getLong("Id")));
		
		
	}
	
	public void removeStudent(Student student) {
		StudentDTO studentDTO= student.getDTO();
		Entity  entity  = transformer.toEntity(studentDTO);
		dataStoreServices.delete(entity.getKey("Id"));
		
	}
	
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}
	
	
}
