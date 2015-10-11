package info.novatec.components.person.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

	@Around("execution(* info.novatec.components.person.boundary.PersonManagementServiceImpl.*(..))")
	public Object logBeforeOperation(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		LOGGER.info("Calling {}.{}", proceedingJoinPoint.getTarget().getClass().getName(), 
				proceedingJoinPoint.getSignature().getName());
		return proceedingJoinPoint.proceed();
	}
}
