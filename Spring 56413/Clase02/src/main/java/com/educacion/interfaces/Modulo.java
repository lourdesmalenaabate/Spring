package com.educacion.interfaces;

// no hacerlo
public interface Modulo {

	default void ejecutarDefault() {
		System.out.println("Ejecutar");
	}

	public static void ejecutarStatic() {
		System.out.println("Ejecutar");
	}

}
