package com.educacion.implementaciones.mariadb;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.educacion.conexiones.MariaDB;
import com.educacion.entidades.Usuario;
import com.educacion.implementaciones.mapeadores.UsuarioMapeador;
import com.educacion.interfaces.DAO;
import com.educacion.interfaces.Modulo;

public class UsuarioImplementacion implements DAO<String, Usuario>, Modulo {
	private Logger log = LogManager.getLogger();
	private MariaDB mariaDB = new MariaDB();
	private JdbcTemplate jdbcTemplate;

	@Override
	public Usuario buscarPorID(String correo) {
		jdbcTemplate = new JdbcTemplate();
		mariaDB.setDriverManagerDataSource();
		jdbcTemplate.setDataSource(mariaDB.getDriverManagerDataSource());

		String query = "SELECT correo, AES_DECRYPT(clave, ?) as clave, fechaActualizacion FROM usuarios where correo = ?;";// correo,
		Usuario usuario = jdbcTemplate.queryForObject(query, new UsuarioMapeador(), mariaDB.getClave(), correo); // fecha,
		log.trace(usuario); // clave

		return usuario;
	}

	@Override
	public Boolean eliminar(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean actualizar(Usuario usuario) {
		// llamando al metodo
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean insertar(Usuario usuario) {

		// llamando al metodo
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listar() {
		// llamando al metodo
		// TODO Auto-generated method stub
		return null;
	}

}
