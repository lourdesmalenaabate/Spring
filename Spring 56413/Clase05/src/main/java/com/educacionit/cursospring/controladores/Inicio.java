package com.educacionit.cursospring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Inicio {

	@RequestMapping("/inicio")
	public String index() {
		return "index";
	}

}
