package com.educacionit.spring.entidades;

import javax.persistence.Column;
// hibernate // eclipse link /hikari
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profesores")
public class Profesor {

	// reflection
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column
	private String descripion;

	// cursos tabla
	//

	public Profesor() {
		super();
	}

	public Profesor(Integer id, String descripion) {
		super();
		this.id = id;
		this.descripion = descripion;
	}

	public Profesor(String descripion) {
		super();
		this.descripion = descripion;
	}

	@Override
	public String toString() {
		return "Profesor [id=" + id + ", descripion=" + descripion + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripion() {
		return descripion;
	}

	public void setDescripion(String descripion) {
		this.descripion = descripion;
	}

}
