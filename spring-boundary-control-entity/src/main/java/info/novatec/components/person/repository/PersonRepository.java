package info.novatec.components.person.repository;

import java.util.List;

import info.novatec.components.person.entity.Person;

public interface PersonRepository {

	long count();

	void delete(Long id);

	void deleteAll();

	List<Person> findAll();

	Person findOne(Long id);

	Person save(Person person);
	
	List<Person> findByLastName(String lastName);

}

