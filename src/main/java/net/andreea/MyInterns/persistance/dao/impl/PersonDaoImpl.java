package net.andreea.MyInterns.persistance.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import net.andreea.MyInterns.comon.PersistenceOperations;
import net.andreea.MyInterns.persistance.dao.PersonDao;
import net.andreea.MyInterns.persistance.entity.Person;
import net.andreea.MyInterns.persistance.entity.User;

@Repository
@Transactional
public class PersonDaoImpl implements PersonDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> getAll() {

		final List<Person> personList = sessionFactory.getCurrentSession().createCriteria(Person.class).list();

		System.out.println("************ ALL Persons ****************");

		return personList;
	}

	@Override
	public Person getById(int id) {

		final ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao personDao = appContext.getBean(PersonDao.class);
		List<Person> persons = new ArrayList<Person>();

		persons = personDao.getAll();
		for (Person person : persons) {
			if (id == person.getId()) {

				return person;
			}
		}
		return null;
	}

	@Override
	public void saveOrUpdate(Person person) {

		new PersistenceOperations().saveOrUpdate(sessionFactory, person,
				"*** Person '" + person.getFirstname() + "' saved!");
	}
}
