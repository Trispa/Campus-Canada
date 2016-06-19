package io.me.campuscanada.api;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class InitialisationServlet implements ServletContextListener{

	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		registerDataStoreEntities();
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
		
	}
	
	private void registerDataStoreEntities(){
		
		
	}

}
