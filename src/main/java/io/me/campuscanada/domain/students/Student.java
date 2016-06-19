
package io.me.campuscanada.domain.students;

import com.google.inject.Inject;

public class Student {

	private String firstName;
	private String lastName;
	private StudentId studentId;
	private String email;
	private StudentAuthSource authSource;
	private String adress;
	private String cycle;
	private String countryOfResidence;

	public Student() {

	}

	private Student(StudentBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.email = builder.email;
		this.countryOfResidence = builder.countryOfResidence;
		this.studentId = builder.studentId;
		this.adress = builder.adress;
		this.cycle = builder.cycle;
		this.authSource = builder.authSource;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountryOfResidence() {
		return countryOfResidence;
	}

	public StudentId getStudentId() {
		return this.studentId;
	}

	public void setStudentId(StudentId id) {
		this.studentId = id;
	}

	public StudentAuthSource getAuthSource() {
		return authSource;
	}

	public String getAdress() {
		return adress;
	}

	public String getCycle() {
		return cycle;
	}

	public static class StudentBuilder {

		private final String firstName;
		private final String lastName;
		private final String email;
		private StudentId studentId;
		private final StudentAuthSource authSource;
		private String adress;
		private String cycle;
		private String countryOfResidence;

		@Inject
		public StudentBuilder(String firstName, String lastName, String email, StudentAuthSource authSource) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.authSource = authSource;
		}

		public StudentBuilder countryOfResidence(String countryOfResidence) {
			this.countryOfResidence = countryOfResidence;
			return this;
		}

		public StudentBuilder studentId(StudentId studentId) {

			this.studentId = studentId;
			return this;
		}

		public StudentBuilder adress(String adress) {
			this.adress = adress;
			return this;
		}

		public StudentBuilder cycle(String cycle) {
			this.cycle = cycle;
			return this;
		}

		public Student build() {
			return new Student(this);
		}
	}

	public StudentDTO getDTO() {
		return new StudentDTO(firstName, lastName, email, studentId, authSource, adress, cycle, countryOfResidence);
	}

}
