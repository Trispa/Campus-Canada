package io.me.campuscanada.persistance.transformers;

import io.me.campuscanada.domain.students.StudentAuthSource;
import io.me.campuscanada.domain.students.StudentDTO;
import io.me.campuscanada.domain.students.StudentId;
import io.me.campuscanada.persistance.students.StudentEntity;

public class StudentDTOTransformer implements EntityDTOTransformer<StudentEntity, StudentDTO> {

	@Override
	public StudentEntity toEntity(StudentDTO dto) {
		return new StudentEntity(dto.studentId.id, dto.authSource.authSource.name(), dto.authSource.authId,
				dto.firstName, dto.lastName, dto.adress, dto.cycle, dto.countryOfResidence);
	}

	@Override
	public StudentDTO toDto(StudentEntity entity) {
		StudentId id = new StudentId(entity.Id);
		StudentAuthSource authSource = new StudentAuthSource(StudentAuthSource.Source.valueOf(entity.authSource),entity.authId);
		return new StudentDTO(entity.firstName, entity.lastName, id, authSource, entity.adress, entity.cycle, entity.countryOfResidence);
	}

}
