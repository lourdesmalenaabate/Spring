package com.educacion.implementaciones.mapeadores;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.educacion.entidades.Usuario;
import com.educacion.utilidades.Fechas;

public class UsuarioMapeador implements RowMapper<Usuario> {

	@Override
	public Usuario mapRow(ResultSet resultSet, int fila) throws SQLException {
		Usuario usuario = new Usuario();
		usuario.setCorreo(resultSet.getString("correo"));
		usuario.setClave(resultSet.getString("clave"));
		usuario.setFechaActualizacion(Fechas.getLocalDateTime(resultSet.getString("fechaActualizacion")));
		return usuario;
	}

}
