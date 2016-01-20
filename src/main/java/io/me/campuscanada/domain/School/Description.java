package io.me.campuscanada.domain.School;

public class Description {
	
	private String province;
	private String  link;
	private String language;
	
	
	public Description(String province, String link, String lg) {
		
		this.province = province;
		this.link = link;
		this.language = lg;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getLg() {
		return language;
	}
	public void setLg(String lg) {
		this.language = lg;
	}
	

}
