package io.me.campuscanada.domain.University;

import com.google.appengine.api.datastore.Link;
import com.google.appengine.repackaged.org.apache.commons.codec.language.bm.Lang;

public class University {

	public static String name;
	private String Description;
	private Link  link;
	private Lang lg;
	public University(String description, Link link, Lang lg) {
		super();
		Description = description;
		this.link = link;
		this.lg = lg;
	}
	public static String getName() {
		return name;
	}
	
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Link getLink() {
		return link;
	}
	public void setLink(Link link) {
		this.link = link;
	}
	public Lang getLg() {
		return lg;
	}
	public void setLg(Lang lg) {
		this.lg = lg;
	}
	
	
	
	
}
