package net.andreea.MyInterns.comon.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.andreea.MyInterns.persistance.dao.PersonDao;
import net.andreea.MyInterns.persistance.entity.Person;

@Path("/person")
public class PersonController {

	ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	PersonDao personDao = appContext.getBean(PersonDao.class);

	@GET
	@Path("/persons")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Person> getList() {

		return personDao.getAll();
	}
	
	@GET
	@Path("/getBy/{user_id}")
	@Produces({ MediaType.APPLICATION_JSON})
	public Person getById(@PathParam("user_id") int id) {
		
		Person person = personDao.getById(id);
		System.out.println(person);

		return person;
	}
	
	@PUT
	@Path("/update")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response update(Person person) {

		personDao.saveOrUpdate(person);

		return Response.ok(person).build();
	}
	
	@POST
	@Path("/add")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response add(Person person) {

		personDao.saveOrUpdate(person);

		return Response.ok(person).build();
	}
}
