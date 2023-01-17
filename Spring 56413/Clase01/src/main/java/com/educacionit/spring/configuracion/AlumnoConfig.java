package com.educacionit.spring.configuracion;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.educacionit.spring.entidades.Alumno;
// DAO

// statement DRiverManeger

@Configuration
public class AlumnoConfig {

	@Bean(name = "alumnoClass") // "" name
	public Alumno getAlumno() {
		Alumno alumno = new Alumno();
		alumno.setDescripcion("Alumno 2 desde class");
		alumno.setDocumento("PAS - 01");
		alumno.setCorreo("alumnos@educacionit.com");
		alumno.setCursos(Arrays.asList("Java SE", "Spring"));

		return alumno;
	}

}
