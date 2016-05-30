package io.me.campuscanada.api;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.impl.translate.opt.joda.JodaTimeTranslators;

import io.me.campuscanada.persistance.students.StudentEntity;

public class InitServlet  implements ServletContextListener{


	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		registerObjectifyEntities();
	}
	
	private void registerObjectifyEntities(){
		JodaTimeTranslators.add(ObjectifyService.factory());
		ObjectifyService.register(StudentEntity.class);
		}
}

