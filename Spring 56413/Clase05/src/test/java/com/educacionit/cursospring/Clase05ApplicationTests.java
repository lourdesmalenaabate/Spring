package com.educacionit.cursospring;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.educacionit.cursospring.entidades.Usuario;
import com.educacionit.cursospring.interfaces.UsuarioRepositorio;

@SpringBootTest
class Clase05ApplicationTests {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Test
	void insertarUsuario() {
		Usuario usuario = new Usuario();
		usuario.setId(2);
		usuario.setCorreo("user2@gmail.com");
		usuario.setClave(bCryptPasswordEncoder.encode("1234"));
		Usuario usuarioRepo = usuarioRepositorio.save(usuario);
		
		Usuario usuarioVerificacion = usuarioRepositorio.findById(1).get();
		
		assertTrue(usuarioVerificacion.equals(usuarioRepo));
	}

}
