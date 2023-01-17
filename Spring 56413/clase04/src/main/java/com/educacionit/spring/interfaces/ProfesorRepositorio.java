package com.educacionit.spring.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educacionit.spring.entidades.Profesor;

@Repository
public interface ProfesorRepositorio extends JpaRepository<Profesor, Integer> {

	
	// Optinal findByDescripcion
}
