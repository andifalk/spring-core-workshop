package info.novatec.person.boundary;

import org.springframework.transaction.annotation.Transactional;

import info.novatec.person.entity.Person;

public interface PersonService {

	@Transactional
	void deleteAll();

	@Transactional(readOnly=true)
	long count();

	@Transactional(readOnly=true)
	Iterable<Person> findAll();

	@Transactional(readOnly=true)
	boolean exists(Long id);

	@Transactional(readOnly=true)
	Person findOne(Long id);

	@Transactional
	<S extends Person> S save(S entity);

}
