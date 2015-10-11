package info.novatec.xml.service;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import info.novatec.xml.service.MyService1;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/spring-services.xml")
public class MyService1Test {
	
	@Autowired
	private MyService1 cut; 

	@Test
	public final void testCallService2() {
		assertThat("Should have got expected message", cut.callService2("World"), is("Hello World"));
	}

}
