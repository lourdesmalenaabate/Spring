package com.educacion.aspectos;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Locale;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.educacion.entidades.Log;
import com.educacion.implementaciones.mariadb.LogImplementacion;

@Aspect
@Component
public class LogAspecto {
	private static Logger logger = LogManager.getLogger();
	LogImplementacion logImplementacion = new LogImplementacion();

	// punto de corte (cuando (firma del metodo))
	@Pointcut("execution( * com.educacion.controladores.*.*(..) )")
	private void pointCutReutilizable() {
	}

	@Pointcut("execution( * com.educacion.controladores.*.end*(..) )")
	private void pointCutEndMetodos() {
	}

	// antes , despues , entre
	// comodin
	// parametros ..
	// todo lo demas *
	@Before("pointCutReutilizable() &&  !pointCutEndMetodos()") // (!)
	public void insertarLogAntes(JoinPoint joinPoint) {

		logger.info(joinPoint.getTarget());
		logger.info(Arrays.toString(joinPoint.getArgs()));
		logger.info(joinPoint.getSourceLocation());
		logger.info(joinPoint.toLongString());
		Log log = new Log(
				joinPoint.getStaticPart() + " - " + joinPoint.getThis().toString() + " - " + joinPoint.getClass(),
				LocalDateTime.now());
		logImplementacion.insertar(log);
		logger.info("Antes..." + log);

		for (Object obj : joinPoint.getArgs()) {
			if (obj instanceof Locale) {
				Locale local = (Locale) obj;
				logger.info(local.getCountry() + " " + local.getDisplayCountry() + " - " + local.getDisplayName()
						+ " - " + local);
			}
		}

	}

	@After("pointCutReutilizable()")
	// @After("execution(public org.springframework.web.servlet.ModelAndView
	// homePage(java.util.Locale, String))")
	public void insertarLogDespues() {
		Log log = new Log("Despues", LocalDateTime.now());
		logImplementacion.insertar(log);
		logger.info("Despues..." + log);
	}

	@AfterReturning("pointCutReutilizable()")
	public void insertarLogEntre() {
		Log log = new Log("Entre", LocalDateTime.now());
		logImplementacion.insertar(log);
		logger.info("Entre..." + log);
	}

	// no se ejecuta
	@AfterThrowing(pointcut = "execution(* com.educacion.*.*.*(..))", throwing = "throwable")
	public void anticiparError(Throwable throwable) {
		Log log = new Log(throwable.getMessage(), LocalDateTime.now());
		logImplementacion.insertar(log);
		logger.error(throwable);
	}

	@Around("pointCutReutilizable()")
	public Object antes_despues(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		Log log = new Log("antes_despues", LocalDateTime.now());
		logImplementacion.insertar(log);
		Object obj = proceedingJoinPoint.proceed();
		logger.info("antes_despues..." + obj);
		return obj;
	}

	// aca rompe
	@Afterketurning (pointcut= execution es.pildoras.aop.dao.clienteDAO.encuentracientes(..)), returning listabeclientes)

public void tareaTrasEncontrarClientes(List<Cliente> listaDeClientes){
for(Cliente c:listaDeClientes){
ifcl.getTipo()"VIP)
System.out.printinExisten clientes VP en el listado. Nombre:" cl.getNombreo);
}}

}
