package week5JavaBackend.dataAccess.concretes;

import week5JavaBackend.dataAccess.abstracts.UserDao;
import week5JavaBackend.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " has been added the server by Hybernate!");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + "'s information has been updated! by Hybernate.");
		
	}

	@Override
	public void del(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " has been removed from the server by Hybernate.");
		
	}



}
