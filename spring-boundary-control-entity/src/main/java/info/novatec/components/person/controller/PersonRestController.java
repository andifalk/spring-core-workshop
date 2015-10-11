package info.novatec.components.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import info.novatec.components.person.boundary.PersonManagementService;
import info.novatec.components.person.entity.Person;

@RestController
public class PersonRestController {

	private PersonManagementService personManagementService;
	
	@RequestMapping(path="/create", method=RequestMethod.POST)
	@ResponseBody
	public Person createPerson (String firstname, String lastname, String yearOfBirth) {
		return this.personManagementService.create(firstname, lastname, yearOfBirth);
	}
	
	@RequestMapping(path="/find-all", method=RequestMethod.GET)
	@ResponseBody
	public List<Person> findAll (String firstname, String lastname, String yearOfBirth) {
		return this.personManagementService.findAll();
	}
	
	@Autowired
	public void setPersonManagementService(PersonManagementService personManagementService) {
		this.personManagementService = personManagementService;
	}
}
