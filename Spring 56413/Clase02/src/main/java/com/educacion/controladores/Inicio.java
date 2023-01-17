package com.educacion.controladores;

import java.util.Locale;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.educacion.entidades.Usuario;
import com.educacion.implementaciones.mariadb.UsuarioImplementacion;
import com.educacionit.spring.Calculos.Calculo;

// stereotypes repository controller service  --> Component
// M V C
@Controller
public class Inicio {
	private Logger logger = LogManager.getLogger();

	// ModelAndView
	// GET POST DELETE PUT ------

	// inyeccion de dependencias
	// logueatr con AOP
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView homePage(Locale locale, String nombre) {
		ModelAndView modelAndView = new ModelAndView();
		logger.info("Entrando al homePage");
		modelAndView.setViewName("homePage");
		//System.out.println(nombre.endsWith(""));
		return modelAndView;
	}

	@RequestMapping(value = "/fin.html", method = RequestMethod.GET)
	public ModelAndView endPage(Locale locale, String nombre) {
		ModelAndView modelAndView = new ModelAndView();
		logger.info("Entrando al homePage");
		modelAndView.setViewName("homePage");
		Calculo.suma(0, 0);
		
		return modelAndView;
	}

	/*
	 * @RequestMapping(value = "/", method = RequestMethod.GET) public ModelAndView
	 * homePage() {
	 * 
	 * // validacion // llamando al metodo // HttpServlet setAt ModelAndView
	 * modelAndView = new ModelAndView(); UsuarioImplementacion
	 * usuarioImplementacion = new UsuarioImplementacion(); Usuario usuario =
	 * usuarioImplementacion.buscarPorID("user1@gmail.com");
	 * 
	 * modelAndView.addObject("usuario", usuario);
	 * modelAndView.setViewName("homePage"); log.debug(usuario);
	 * 
	 * return modelAndView; }
	 */
}
