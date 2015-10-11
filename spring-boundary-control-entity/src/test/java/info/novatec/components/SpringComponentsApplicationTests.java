package info.novatec.components;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import info.novatec.components.person.boundary.PersonManagementService;
import info.novatec.components.person.entity.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringComponentsApplication.class)
public class SpringComponentsApplicationTests {

	@Autowired
	private PersonManagementService personManagementService;
	
	@Test
	public void contextLoads() {
		
		Person person = personManagementService.create("Hans", "Mustermann", "1970");
		
		assertThat("Person should be valid one", person, is(notNullValue()));
	}

}
