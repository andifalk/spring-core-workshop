package info.novatec.components.person.control;

import java.util.List;

import info.novatec.components.person.entity.Person;

public interface PersonService {
	
	List<Person> findByLastName(String lastName);

	Person save(Person person);

	List<Person> findAll();

	void deleteAll();

	long count();

}
