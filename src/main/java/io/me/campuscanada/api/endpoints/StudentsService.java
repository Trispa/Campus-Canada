package io.me.campuscanada.api.endpoints;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.response.NotFoundException;
import com.google.inject.Inject;

import io.me.campuscanada.api.requests.CreateStudentRequest;
import io.me.campuscanada.constants.*;
import io.me.campuscanada.domain.students.Student;
import io.me.campuscanada.domain.students.StudentId;
import io.me.campuscanada.domain.students.StudentNotFoundError;
import io.me.campuscanada.domain.students.StudentRepository;

@Api(name = "campuscanada",
version = "v1",
clientIds = {Constants.API_EXPLORER_CLIENT_ID}
)
public class StudentsService {
	
	
	private Student student;
	private StudentRepository studentRepository;
	
	
	@Inject
	public StudentsService(Student student, StudentRepository studentRepository){
		this.student = student;
		this.studentRepository = studentRepository;
	}
	@ApiMethod(httpMethod = HttpMethod.POST)
	public Student create(CreateStudentRequest request){
		Student student = new Student.StudentBuilder(request.firstName, request.lastName, request.email, request.authSource)
				.adress(request.adress)
				.countryOfResidence(request.countryOfResidence)
				.cycle(request.cycle)
				.build();
		this.studentRepository.addStudent(student);
		return student;
	}
	
	@ApiMethod(httpMethod = HttpMethod.GET)
	public Student getStudent(@Named("id") Long id) throws NotFoundException {
		
		StudentId studentId = new StudentId(id);
		Student student;
		try{
			student = this.studentRepository.findById(studentId);
		}catch(StudentNotFoundError e){
			throw new NotFoundException(e);
		}
		return student;
	}
	
}