package info.novatec.components.person.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import info.novatec.components.person.entity.Person;

@Repository
public class PersonRepositoryMap implements PersonRepository {
	
	private Map<String,Person> personMap = new HashMap<>();
	
	@PostConstruct
	public void initializeData() {
		Person person = new Person("Hans", "Mustermann", "1999");
		personMap.put(person.getLastname(), person);
		person = new Person("Peter", "Maier", "1958");
		personMap.put(person.getLastname(), person);
		person = new Person("Peter", "Müller", "1969");
		personMap.put(person.getLastname(), person);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Person> findAll() {
		return new ArrayList<>(personMap.values());
	}

	@Override
	public Person findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person save(Person person) {
		return personMap.put(person.getLastname(), person);
	}

	@Override
	public List<Person> findByLastName(String lastName) {
		if (personMap.containsKey(lastName)) {
			return Collections.singletonList(personMap.get(lastName));
		} else {
			return new ArrayList<>();
		}
	}

}
