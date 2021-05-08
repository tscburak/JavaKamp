package week5JavaBackend.dataAccess.abstracts;

import week5JavaBackend.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void del(User user);

}
