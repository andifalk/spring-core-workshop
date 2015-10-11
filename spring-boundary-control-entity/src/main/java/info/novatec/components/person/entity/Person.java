package info.novatec.components.person.entity;

import java.io.Serializable;

/**
 * Person.
 */
@SuppressWarnings("serial")
public class Person implements Serializable {
	
	private String firstname;
	private String lastname;
	private String yearOfBirth;
	
	
	public Person() {
		super();
	}

	public Person(String firstname, String lastname, String yearOfBirth) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.yearOfBirth = yearOfBirth;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public String getYearOfBirth() {
		return yearOfBirth;
	}
	

}
