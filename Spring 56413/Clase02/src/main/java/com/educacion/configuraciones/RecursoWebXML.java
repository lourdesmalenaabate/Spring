package com.educacion.configuraciones;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class RecursoWebXML implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// llamando al metodo
		AnnotationConfigWebApplicationContext contexto = new AnnotationConfigWebApplicationContext();
		// contexto.setConfigLocations("com.educacion.configuraciones.RecursoSpringContexto");
		contexto.register(RecursoSpringContexto.class);
		contexto.register(RecursoSpringAspecto.class);
		contexto.setServletContext(servletContext);

		ServletRegistration.Dynamic appServlet = servletContext.addServlet("appServlet",
				new DispatcherServlet(contexto));

		appServlet.setLoadOnStartup(1);

		appServlet.addMapping("*.html");

	}

}
