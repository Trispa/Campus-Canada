package io.me.campuscanada.domain.School;

public class Programme {
	
	private Cycle  cycle;
	private String name;
	private String description;
	public Programme(Cycle cycle, String name, String description) {
		this.cycle = cycle;
		this.name = name;
		this.description = description;
	}
	public Cycle getCycle() {
		return cycle;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	

}
