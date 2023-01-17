package com.educacion.interfaces;

import java.sql.SQLException;
import java.util.List;

// inyeccion de dependencias
public interface DAO<K, E> {

	E buscarPorID(K k) throws SQLException;

	Boolean eliminar(E e);

	Boolean actualizar(E e);

	Boolean insertar(E e);

	List<E> listar();

}
