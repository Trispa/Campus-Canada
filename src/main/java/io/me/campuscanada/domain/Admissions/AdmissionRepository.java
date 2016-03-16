package io.me.campuscanada.domain.Admissions;


public interface AdmissionRepository {


	public Admission getById(AdmissionId id);
	
	public void addAdmission(Admission admission);
	
	public void deletedAdmission(Admission admission);
	
	public void updateAdmission(Admission admission);
	
	
}
