package com.educacion.configuraciones;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = { "com.educacion.aspectos" })
@EnableAspectJAutoProxy
public class RecursoSpringAspecto {

}
