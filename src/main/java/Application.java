import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.andreea.MyInterns.persistance.dao.PersonDao;
import net.andreea.MyInterns.persistance.dao.UserDao;
import net.andreea.MyInterns.persistance.entity.Person;
import net.andreea.MyInterns.persistance.entity.User;

public class Application {

	public static void main(String[] args) {

		final ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//		StudentDao studentDao = appContext.getBean(StudentDao.class);
//		MentorDao mentorDao = appContext.getBean(MentorDao.class);
		UserDao userDao = appContext.getBean(UserDao.class);
		PersonDao personDao = appContext.getBean(PersonDao.class);
//
//		UserDto userDto = new UserDto();
//		
//		User userEntity = new User();
//		BeanUtils.copyProperties(userDto, userEntity);

//		int counter = 0;
//		for (User user : userDao.getAll()) {
//			counter++;
//			System.out.println("User  " + counter + ": " + user.getEmail());
//		}

//		
//	    final User user1 = new User("Ciprian", "ciprian@gmail.com", "password123");
//	    userDao.saveOrUpdate(user1);
//		final Person person = new Person(false, "andreea", "schiau", "student", user1);
//		personDao.saveOrUpdate(user1, person);


	}
}

		
//		userDao.getAll();		

//		List<User> users = new ArrayList<User>();

//		users = userDao.getAll();
//		for (User user : users) {
//			if (user.getIsMentor() == true)
//				System.out.println("Userul este mentor!");
//		}

//	    final User user1 = new User("ciprian@gmail.com", "root", true);
//	    userDao.saveOrUpdate(user1);
//	    final Mentor mentor1 = new Mentor("Ciprian", "Verosimo", user1);
//	    mentorDao.saveOrUpdateIfMentor(user1, mentor1);

//	    final User user = new User("carmen@gmail.com", "root", true);
//	    userDao.saveOrUpdate(user);
//	    final Student student = new Student("Ciprian", "Verosimo", "Descriere", user);
//	    studentDao.saveOrUpdateIfStudent(user, student);
//
//		mentors = mentorDao.getAll();
//		if (mentorDao.getById(5) != null) {
//			System.out.println("yes!");
//		}
//		if (mentor.getIsMentor() == true)
//			System.out.println("Userul este mentor!");
//
//	}
//}
