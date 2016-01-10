package io.me.campuscanada.domain.School;

import com.google.appengine.api.datastore.Link;
import com.google.appengine.repackaged.org.apache.commons.codec.language.bm.Lang;

public class Description {
	
	private String province;
	private Link  link;
	private Lang lg;
	
	
	public Description(String province, Link link, Lang lg) {
		
		this.province = province;
		this.link = link;
		this.lg = lg;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
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
