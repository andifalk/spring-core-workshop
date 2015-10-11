package info.novatec.person.boundary;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.OutputCapture;
import org.springframework.test.util.ReflectionTestUtils;

import info.novatec.person.entity.Person;
import info.novatec.person.repository.PersonRepository;

public class PersonServiceTest {

	@Rule
	public OutputCapture capture = new OutputCapture();
	
	private PersonService cut;

	@Test
	public void verifyFindOne() {
		cut = new PersonServiceImpl();
		
		Person person = new Person("Hans", "Mustermann");
		ReflectionTestUtils.setField(person, "id", 1L);
		
		PersonRepository personRepository = mock(PersonRepository.class);
		when(personRepository.findOne(1L)).thenReturn(person);
		
		ReflectionTestUtils.setField(cut, "personRepository", personRepository);
		
		Person personFound = cut.findOne(1L);
		
		assertThat("Should have found a valid person", personFound, is(notNullValue()));
		assertThat("Should have found person with expected id", personFound.getId(), is(1L));
		
		capture.expect(containsString("ReflectionTestUtils - Setting field 'personRepository'"));
		
		
	}

}
