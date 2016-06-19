package io.me.campuscanada.api;
import java.util.HashSet;
import java.util.Set;
import io.me.campuscanada.api.endpoints.StudentsService;

import com.google.api.server.spi.guice.GuiceSystemServiceServletModule;
public class ApiServiceModule extends GuiceSystemServiceServletModule  {

	@Override
	public void configureServlets() {
		super.configureServlets();
		Set<Class<?>> serviceClasses = new HashSet<Class<?>>();
		serviceClasses.add(StudentsService.class);
		this.serveGuiceSystemServiceServlet("/_ah/api/*", serviceClasses);

	}


}
