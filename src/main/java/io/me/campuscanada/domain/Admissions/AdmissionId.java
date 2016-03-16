package io.me.campuscanada.domain.Admissions;


public class AdmissionId {

	public Long id;
	public static final AdmissionId NOT_SET = new AdmissionId(null);
	
	public AdmissionId(Long id){
		this.id = id;
	}
	public boolean equals(AdmissionId anotherAdmissionId){
		if(this.id == null && anotherAdmissionId.id == null){
			return true;
		}
		if (this.id != null){
			return this.id.equals(anotherAdmissionId.id);
		}
		return false;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
}
