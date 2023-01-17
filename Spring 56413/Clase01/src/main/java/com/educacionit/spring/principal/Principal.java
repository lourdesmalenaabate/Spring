package com.educacionit.spring.principal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.educacionit.spring.configuracion.AlumnoConfig;
import com.educacionit.spring.entidades.Alumno;

public class Principal {
	private static final Logger log = LogManager.getLogger(Principal.class);

	public static void main(String[] args) {

		try {

			ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("ApplicationContext.xml");
			// Alumno alumno = (Alumno) contexto.getBean("alumnoXML");
			Alumno alumno = contexto.getBean("alumnoXML", Alumno.class);
			/*
			 * alumno.setDescripcion("Alumno1"); alumno.setDocumento("01");
			 */
			log.info(alumno);
			contexto.close();
		} catch (Exception e) {
			log.error(e);
		}

		try {
			// en tiempo de ejecucion o interpretacion a traves de reflect
			ApplicationContext contexto = new AnnotationConfigApplicationContext(AlumnoConfig.class);
			Alumno alumno = (Alumno) contexto.getBean("alumnoClass");
			alumno.setDescripcion("Alumno2");
			alumno.setDocumento("02");
			log.info(alumno);
			contexto = null;
		} catch (Exception e) {
			log.error(e);
		}

		try {
			ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("ApplicationContext.xml");
			Alumno alumno = contexto.getBean("alumno", Alumno.class);
			log.info(alumno);
			contexto.close();

		} finally {

		}

	}
}
