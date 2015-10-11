package info.novatec.javaconfig.service;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import info.novatec.javaconfig.SpringConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringConfiguration.class)
public class MyService1Test {
	
	@Autowired
	private MyService1 cut; 

	@Test
	public final void testCallService2() {
		assertThat("Should have got expected message", cut.callService2("World"), is("Hello World"));
	}

}
