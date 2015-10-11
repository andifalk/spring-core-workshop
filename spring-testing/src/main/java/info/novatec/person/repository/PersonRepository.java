package info.novatec.person.repository;

import org.springframework.data.repository.CrudRepository;

import info.novatec.person.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
