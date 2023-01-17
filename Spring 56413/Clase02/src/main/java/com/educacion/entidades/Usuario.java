package com.educacion.entidades;

import java.time.LocalDateTime;

import com.educacion.utilidades.Fechas;

public class Usuario {
	private String correo;
	private String clave;
	private LocalDateTime fechaActualizacion;

	public Usuario() {
		super();
	}

	public Usuario(String correo, String clave, LocalDateTime fechaActualizacion) {
		super();
		this.correo = correo;
		this.clave = clave;
		this.fechaActualizacion = fechaActualizacion;
	}

	@Override
	public String toString() {
		return "Usuario [correo=" + correo + ", clave=" + clave + ", fechaActualizacion=" + Fechas.getStringLocalDateTime(fechaActualizacion) + "]";
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public LocalDateTime getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

}
