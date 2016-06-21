package io.me.campuscanada.api;

import com.google.inject.AbstractModule;
import io.me.campuscanada.domain.students.Student;
import io.me.campuscanada.domain.students.StudentRepository;
import io.me.campuscanada.persistance.students.DataStoreStudentRepository;
import io.me.campuscanada.persistance.transformers.StudentDTOTransformer;

public class DomaineModule extends AbstractModule  {

	@Override
	protected void configure() {
		bind(StudentDTOTransformer.class);
		bind(Student.StudentBuilder.class);
		bind(StudentRepository.class).to(DataStoreStudentRepository.class);
		
	}

}
