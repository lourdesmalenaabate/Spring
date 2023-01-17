package com.educacionit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.educacionit.spring.entidades.Profesor;
import com.educacionit.spring.interfaces.ProfesorRepositorio;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	ProfesorRepositorio profesorRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		profesorRepositorio.save(new Profesor("Octavio Robleto"));
		profesorRepositorio.save(new Profesor("Ivana"));
	}

}
