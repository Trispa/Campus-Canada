package io.me.campuscanada.domain.Admissions;

public enum AdmissionSteps {

	ETAPE1("Exploration"), 
	ETAPE2("préparation du dossier"), 
	ETEPE3("Envoi de la demande"), 
	ETAPE4("Suivit apres envoit de la demande");
	
	private String steps;
	
	private AdmissionSteps(String s){
		this.steps = s;
	}
	
	public String getNomStep(){
		return this.steps;
	}
}