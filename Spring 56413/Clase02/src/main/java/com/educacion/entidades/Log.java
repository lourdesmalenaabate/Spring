package com.educacion.entidades;

import java.time.LocalDateTime;

import com.educacion.utilidades.Fechas;

public final class Log {
	private Long id;
	private String descripcion;
	private LocalDateTime fecha;

	public Log() {
		super();
	}

	public Log(String descripcion, LocalDateTime fecha) {
		super();
		this.descripcion = descripcion;
		this.fecha = fecha;
	}

	public Log(Long id, String descripcion, LocalDateTime fecha) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Log [" + id + ", " + descripcion + ", " + Fechas.getStringLocalDateTime(fecha) + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

}
