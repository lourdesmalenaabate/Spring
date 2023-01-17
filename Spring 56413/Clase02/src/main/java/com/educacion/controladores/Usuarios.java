package com.educacion.controladores;

import java.util.Locale;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Usuarios {
	private Logger logger = LogManager.getLogger();

	@RequestMapping(value = "/usuarios.html", method = RequestMethod.GET)
	public String homePage(Locale locale, ModelAndView modelAndView) {
		logger.info("Entrando a usuarios");
		return "usuarios";
	}

	@RequestMapping(value = "/finUsuarios.html", method = RequestMethod.GET)
	public String endPagina(Locale locale, ModelAndView modelAndView) {
		logger.info("Entrando a usuarios");
		return "usuarios";
	}

}
