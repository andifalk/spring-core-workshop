package info.novatec.components.person.boundary;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class LoggingBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingBeanFactoryPostProcessor.class);
	
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		LOGGER.info("postProcessBeanFactory, all @Service classes: {}", 
				Arrays.asList(beanFactory.getBeanNamesForAnnotation(Service.class)));
	}

}
