package com.educacion.implementaciones.mariadb;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.educacion.conexiones.MariaDB;
import com.educacion.entidades.Log;
import com.educacion.interfaces.DAO;
import com.educacion.utilidades.Fechas;

public class LogImplementacion implements DAO<Long, Log> {
	private Logger log = LogManager.getLogger();
	private MariaDB mariaDB = new MariaDB();
	private JdbcTemplate jdbcTemplate;

	@Override
	public Log buscarPorID(Long k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminar(Log e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean actualizar(Log e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean insertar(Log log) {
		jdbcTemplate = new JdbcTemplate();
		mariaDB.setDriverManagerDataSource();
		jdbcTemplate.setDataSource(mariaDB.getDriverManagerDataSource());

		String query = "INSERT INTO logs (descripcion, fecha) VALUES(?, ?);";
		int id = jdbcTemplate.update(query, log.getDescripcion(), Fechas.getStringLocalDateTime(log.getFecha()));

		return id == 1;
	}

	@Override
	public List<Log> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
