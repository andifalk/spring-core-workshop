package info.novatec.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import info.novatec.javaconfig.service.MyService1;
import info.novatec.javaconfig.service.MyService1Impl;
import info.novatec.javaconfig.service.MyService2;
import info.novatec.javaconfig.service.MyService2Impl;

@Configuration
public class SpringConfiguration {
	
	@Bean
	public MyService2 myService2() {
		return new MyService2Impl();
	}
	
	@Bean
	public MyService1 myService1() {
		return new MyService1Impl(myService2());
	}
}
