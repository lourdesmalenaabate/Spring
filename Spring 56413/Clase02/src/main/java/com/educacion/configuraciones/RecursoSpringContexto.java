package com.educacion.configuraciones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = { "com.educacion" })
@EnableWebMvc
public class RecursoSpringContexto {

	@Bean
	public InternalResourceViewResolver getRecursos() {
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/vistas/");
		internalResourceViewResolver.setSuffix(".jsp");

		return internalResourceViewResolver;
	}
}
