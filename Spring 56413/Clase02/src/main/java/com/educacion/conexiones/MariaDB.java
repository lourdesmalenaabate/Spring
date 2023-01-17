package com.educacion.conexiones;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.educacion.utilidades.EsquemaBase64;

public class MariaDB {

	private static Logger log = LogManager.getLogger();
	private String clave;
	private DriverManagerDataSource driverManagerDataSource;

	public void setDriverManagerDataSource() {
		driverManagerDataSource = new DriverManagerDataSource();
		Properties properties = new Properties();
		InputStream inputStream = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("database.properties");
		try {
			properties.load(inputStream);
			String driver = properties.getProperty("db.driver");
			String url = properties.getProperty("db.url");
			String usuario = properties.getProperty("db.user", "root");
			String password = properties.getProperty("db.pass");
			this.clave =EsquemaBase64.decodificar(properties.getProperty("db.key"));

			driverManagerDataSource.setDriverClassName(driver);
			driverManagerDataSource.setUrl(url);
			driverManagerDataSource.setUsername(usuario);
			driverManagerDataSource.setPassword(password);
			log.info("Se estable la conexion a la base correctamente ");

		} catch (IOException e) {
			log.error(e);
			e.printStackTrace();
		}

	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public DriverManagerDataSource getDriverManagerDataSource() {
		return driverManagerDataSource;
	}

	public void setDriverManagerDataSource(DriverManagerDataSource driverManagerDataSource) {
		this.driverManagerDataSource = driverManagerDataSource;
	}

}
