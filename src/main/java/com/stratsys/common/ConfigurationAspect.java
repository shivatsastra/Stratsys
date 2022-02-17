package com.stratsys.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ConfigurationAspect {

	private static final Logger logger = LoggerFactory.getLogger(ConfigurationAspect.class);

	@Before("within(com.stratsys..*)")
	public void logBeforeAdvice(JoinPoint joinPoint) {
		logger.debug("Before invoking " + joinPoint.getSignature());
	}

	@After("within(com.stratsys..*)")
	public void logAfterAdvice(JoinPoint joinPoint) {
		logger.debug("After completion " + joinPoint.getSignature());
	}
	
	@Before("within(io.swagger..*)")
	public void logBeforeSwaggerAdvice(JoinPoint joinPoint) {
		logger.debug("Before invoking " + joinPoint.getSignature());
	}

	@After("within(io.swagger..*)")
	public void logAfterSwaggerAdvice(JoinPoint joinPoint) {
		logger.debug("After completion " + joinPoint.getSignature());
	}

	@AfterThrowing(pointcut = "within(io.swagger..*)", throwing = "e")
	public void logAfterSwaggerThrowing(JoinPoint joinPoint, Exception e) throws Throwable {
		for (StackTraceElement ste : e.getStackTrace()) {
			if (ste.getClassName().contains("io.swagger")) {
				logger.error("An Exception of : {} has been thrown from Method : {} of Class : {} on Line Number : {} ",
						e.getClass().getSimpleName(), ste.getMethodName(), ste.getClassName(), ste.getLineNumber());
				break;
			}
		}
	}

	@AfterThrowing(pointcut = "within(com.stratsys..*)", throwing = "e")
	public void logAfterServiceThrowing(JoinPoint joinPoint, Exception e) throws Throwable {
		for (StackTraceElement ste : e.getStackTrace()) {
			if (ste.getClassName().contains("com.ikea.ptag")) {
				logger.error("An Exception of : {} has been thrown from Method : {} of Class : {} on Line Number : {} ",
						e.getClass().getSimpleName(), ste.getMethodName(), ste.getClassName(), ste.getLineNumber());
				break;
			}
		}
	}
}
