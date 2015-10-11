package info.novatec.person.boundary;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import info.novatec.person.entity.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@WebIntegrationTest(randomPort=true)
@ContextConfiguration( classes={PersonServiceIntegrationTestConfiguration.class},
	initializers = ConfigFileApplicationContextInitializer.class,
	loader=AnnotationConfigContextLoader.class)
public class PersonServiceIntegrationTest {
	
	@Autowired
	private PersonService cut;

	@Test
	public void testFindOne() {
		Person person = cut.findOne(1L);
		assertThat("", person, notNullValue());
		
	}

}
