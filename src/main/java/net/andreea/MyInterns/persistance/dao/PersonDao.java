package net.andreea.MyInterns.persistance.dao;

import java.util.List;

import net.andreea.MyInterns.persistance.entity.Person;
import net.andreea.MyInterns.persistance.entity.User;

public interface PersonDao {
	
	List<Person> getAll();

	Person getById(int id);
	
	void saveOrUpdate(final Person person);
}
