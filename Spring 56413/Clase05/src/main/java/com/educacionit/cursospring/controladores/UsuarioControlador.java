package com.educacionit.cursospring.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.educacionit.cursospring.entidades.Usuario;
import com.educacionit.cursospring.interfaces.UsuarioRepositorio;

@Controller
public class UsuarioControlador {
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	@RequestMapping("/agregarForm")
	public String agregar(Model model, Usuario usuario) {
		usuarioRepositorio.save(usuario);
		model.addAttribute("usuarios", usuarioRepositorio.findAll());

		return "index";
	}

	@RequestMapping("/eliminar/{id}")
	public String eliminar(Model model, @PathVariable Integer id) {
		usuarioRepositorio.deleteById(id);
		model.addAttribute("usuarios", usuarioRepositorio.findAll());

		return "index";
	}

}
