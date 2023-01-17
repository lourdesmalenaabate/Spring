package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.educacionit.spring.entidades.Profesor;

//restcontroller
@Controller
public class Inicio {

	// @Autowired
	// Profesor profesor;

	@RequestMapping("/saludo")
	@ResponseBody
	public String saludo() {

		// se supone instanciado por la anotacion
		// profesor.setId(2);
		return "Hola Mundo";
	}

	@RequestMapping("/saludoMustache")
	public String saludoMustache(Model model) {
		model.addAttribute("saludo", "Hola desde Spring boot y Mustache");

		return "saludoMustacheT";
	}

}
