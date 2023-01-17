package com.educacionit.cursospring.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.educacionit.cursospring.entidades.Usuario;
import com.educacionit.cursospring.interfaces.UsuarioRepositorio;

@RestController
@RequestMapping("/api")

public class UsuarioControladorRest {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	@RequestMapping(path = "/listar", produces = { MediaType.APPLICATION_JSON_VALUE }, method = { RequestMethod.GET })
	public List<Usuario> listar() {
		return usuarioRepositorio.findAll();
	}

	@RequestMapping(value = "/agregar", consumes = { MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8" }, produces = {
			MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8" }, method = { RequestMethod.POST })
	public ResponseEntity<Usuario> agregar(@RequestBody Usuario usuario) {
		usuarioRepositorio.save(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
	}

}
