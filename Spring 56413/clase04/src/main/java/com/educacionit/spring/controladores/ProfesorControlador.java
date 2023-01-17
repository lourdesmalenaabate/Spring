package com.educacionit.spring.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.educacionit.spring.entidades.Profesor;
import com.educacionit.spring.interfaces.ProfesorRepositorio;

@Controller
public class ProfesorControlador {

	@Autowired
	ProfesorRepositorio profesorRepositorio;

	@RequestMapping("/getProfesor")
	@ResponseBody
	public String getProfesor() {

		return profesorRepositorio.findAll().toString();
	}

	@RequestMapping("/getProfesorPorID")
	@ResponseBody
	public String getProfesorPorID(@RequestParam Integer id) {
		Profesor profesor = profesorRepositorio.findById(id).get();

		return profesor.toString();
	}

}
