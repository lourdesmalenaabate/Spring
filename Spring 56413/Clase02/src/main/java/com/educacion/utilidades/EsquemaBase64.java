package com.educacion.utilidades;

import java.util.Base64;

public interface EsquemaBase64 {
	static String codificar(String cadena) {
		return Base64.getEncoder().encodeToString(cadena.getBytes());
	}

	// byte[] misBytes = Base64.getDecoder().decode(cadena)
	// new String (misBytes)
	static String decodificar(String cadena) {
		return new String(Base64.getDecoder().decode(cadena));
	}
}
