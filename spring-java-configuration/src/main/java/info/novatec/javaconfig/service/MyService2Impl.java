package info.novatec.javaconfig.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyService2Impl implements MyService2 {
	
	private static final Logger LOG = LoggerFactory.getLogger(MyService2Impl.class);

	@Override
	public String sayHello(String message) {
		String helloMsg = "Hello " + message;
		LOG.info("Greeting: {}", helloMsg);
		return helloMsg;
	}

}
