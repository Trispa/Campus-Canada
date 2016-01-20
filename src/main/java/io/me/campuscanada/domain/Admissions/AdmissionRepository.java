package io.me.campuscanada.domain.Admissions;


public interface AdmissionRepository {


	public Admission getById(AdmissionId id);
	
	public void addAdmission(Admission admission);
	
}
