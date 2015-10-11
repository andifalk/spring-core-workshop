package info.novatec.components.person.boundary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class LoggingBeanPostProcessor implements BeanPostProcessor {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingBeanPostProcessor.class); 

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ( beanName.startsWith("person")) {
			LOGGER.info("postProcessBeforeInitialization {}", beanName);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ( beanName.startsWith("person")) {
			LOGGER.info("postProcessAfterInitialization {}", beanName);
		}
		return bean;
	}

}
