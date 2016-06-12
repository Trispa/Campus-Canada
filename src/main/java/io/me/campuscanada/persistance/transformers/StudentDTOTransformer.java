package io.me.campuscanada.persistance.transformers;

import com.google.cloud.datastore.Entity;

import io.me.campuscanada.domain.students.StudentAuthSource;
import io.me.campuscanada.domain.students.StudentDTO;
import io.me.campuscanada.domain.students.StudentId;
import io.me.campuscanada.persistance.students.StudentEntity;
import io.me.campuscanada.persistance.students.StudentEntityCreatore;

public class StudentDTOTransformer implements EntityDTOTransformer<Entity, StudentDTO> {

	private StudentEntityCreatore studentEntityCreatore = new StudentEntityCreatore();
	@Override
	public Entity toEntity(StudentDTO dto) {
		return studentEntityCreatore.createStudentEntityCreatore(new StudentEntity(dto.studentId.id, dto.authSource.authSource.name(), dto.authSource.authId,
				dto.firstName, dto.lastName,dto.email, dto.adress, dto.cycle, dto.countryOfResidence));
	}

	@Override
	public StudentDTO toDto(Entity entity) {
		
		StudentId id = new StudentId(entity.getLong("id"));
		StudentAuthSource authSource = new StudentAuthSource(StudentAuthSource.Source.valueOf(entity.getString("authSource")),entity.getString("authId"));
		return new StudentDTO(entity.getString("firstName"), entity.getString("lastName"),entity.getString("email"), id, authSource, entity.getString("adress"), entity.getString("cycle"), entity.getString("countryOfResidence"));
	}

}
