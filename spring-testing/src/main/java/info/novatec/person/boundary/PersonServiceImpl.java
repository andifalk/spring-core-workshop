package info.novatec.person.boundary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.novatec.person.entity.Person;
import info.novatec.person.repository.PersonRepository;

@Service("personService")
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public <S extends Person> S save(S entity) {
		return personRepository.save(entity);
	}

	@Override
	public Person findOne(Long id) {
		return personRepository.findOne(id);
	}

	@Override
	public boolean exists(Long id) {
		return personRepository.exists(id);
	}

	@Override
	public Iterable<Person> findAll() {
		return personRepository.findAll();
	}

	@Override
	public long count() {
		return personRepository.count();
	}

	@Override
	public void deleteAll() {
		personRepository.deleteAll();
	}
	
	

}
