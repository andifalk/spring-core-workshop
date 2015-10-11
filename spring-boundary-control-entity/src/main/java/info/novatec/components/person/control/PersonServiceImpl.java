package info.novatec.components.person.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.novatec.components.person.entity.Person;
import info.novatec.components.person.repository.PersonRepository;

@Service("personService")
public class PersonServiceImpl implements PersonService {
	
	private PersonRepository personRepository;
	
	@Override
	public List<Person> findByLastName(String lastName) {
		return personRepository.findByLastName(lastName);
	}
		
	@Override
	public long count() {
		return personRepository.count();
	}

	@Override
	public void deleteAll() {
		personRepository.deleteAll();
	}

	@Override
	public List<Person> findAll() {
		return personRepository.findAll();
	}

	@Override
	public Person save(Person person) {
		return personRepository.save(person);
	}

	@Autowired
	public void setPersonRepository(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

}
