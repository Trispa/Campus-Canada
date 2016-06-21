package io.me.campuscanada.api;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.google.appengine.api.rdbms.AppEngineDriver;

public class InitialisationServlet implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		try {
			DriverManager.registerDriver(new AppEngineDriver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}

}
