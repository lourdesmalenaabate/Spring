package com.educacionit.spring.entidades;

import java.util.List;

// Pojo bean 
public class Alumno {
	private String descripcion;
	private String documento;
	private List<String> cursos;
	private String correo;

	public Alumno() {

	}

	public Alumno(String descripcion, String documento, List<String> cursos, String correo) {
		super();
		this.descripcion = descripcion;
		this.documento = documento;
		this.cursos = cursos;
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Alumno [descripcion=" + descripcion + ", documento=" + documento + ", cursos=" + cursos + ", correo="
				+ correo + "]";
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public List<String> getCursos() {
		return cursos;
	}

	public void setCursos(List<String> cursos) {
		this.cursos = cursos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
