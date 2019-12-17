package net.andreea.MyInterns.persistance.dao;

import java.util.List;

import net.andreea.MyInterns.persistance.entity.Person;
import net.andreea.MyInterns.persistance.entity.User;

public interface UserDao {

	List<User> getAll();
	
	User getById(long id);
	
	void delete(long id);

	void saveOrUpdate(String username, String email, String password, Person person);

	void saveOrUpdate(final User user);
}
