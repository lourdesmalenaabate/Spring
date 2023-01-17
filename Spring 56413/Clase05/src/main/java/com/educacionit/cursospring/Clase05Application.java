package com.educacionit.cursospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clase05Application {

	public static void main(String[] args) {
		SpringApplication.run(Clase05Application.class, args);
		System.setProperty("tomcat.util.http.parser.HttpParser.requestTargetAllow", "|{}");
	}

}
