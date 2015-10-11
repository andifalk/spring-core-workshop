package info.novatec.components.person.boundary;

import java.util.List;

import info.novatec.components.person.entity.Person;

public interface PersonManagementService {

	/**
	 * Creates new {@link Person}.
	 * @param firstName first name
	 * @param lastName last name
	 * @param yearOfBirth year of birth
	 * @return created {@link Person}
	 */
	Person create(String firstName, String lastName, String yearOfBirth);
	
	/**
	 * Find all existing {@link Person}s.
	 * @return list of {@link Person}s
	 */
	List<Person> findAll();

}
