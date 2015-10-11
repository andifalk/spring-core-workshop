package info.novatec.components.person.boundary;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.LifecycleProcessor;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Service;

import info.novatec.components.person.control.PersonService;
import info.novatec.components.person.entity.Person;

@Service("personManagementService")
public class PersonManagementServiceImpl implements PersonManagementService,
	InitializingBean, DisposableBean, SmartLifecycle, LifecycleProcessor {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PersonManagementServiceImpl.class); 
	
	private PersonService personService;
	
	private boolean isRunning;
	
	public PersonManagementServiceImpl() {
		super ();
		LOGGER.info("PersonManagementServiceImpl()");
	}
	
	/**
	 * @see InitializingBean#afterPropertiesSet().
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		LOGGER.info("afterPropertiesSet()");
	}
	
	@PostConstruct
	public void initialize() {
		LOGGER.info("@PostConstruct initialize()");
	}

	@Override
	public void start() {
		LOGGER.info("Lifecycle.start()");	
		isRunning = true;
	}

	@PreDestroy
	public void cleanup() {
		LOGGER.info("@PreDestroy cleanup()");
	}
		
	@Override
	public Person create (String firstName,String lastName,String yearOfBirth) {
		return this.personService.save(new Person(firstName,lastName,yearOfBirth));
	}

	@Override
	public List<Person> findAll() {
		return this.personService.findAll();
	}

	@Autowired
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	/**
	 * @see DisposableBean#destroy().
	 */
	@Override
	public void destroy() throws Exception {
		LOGGER.info("destroy()");
		
	}

	@Override
	public boolean isRunning() {
		LOGGER.info("Lifecycle.isRunning(): {}", isRunning);	
		return isRunning;
	}

	@Override
	public void stop() {
		LOGGER.info("Lifecycle.stop()");
		isRunning = false;
	}

	@Override
	public int getPhase() {
		return 1;
	}

	@Override
	public boolean isAutoStartup() {
		return true;
	}

	@Override
	public void stop(Runnable runnable) {
		LOGGER.info("SmartLifecycle.stop(Runnable)");		
		runnable.run();
	}

	@Override
	public void onRefresh() {
		LOGGER.info("LifecycleProcessor.onRefresh()");		
		
	}

	@Override
	public void onClose() {
		LOGGER.info("LifecycleProcessor.onClose()");		
	}


}
