package week5JavaBackend.business.abstracts;

import week5JavaBackend.entities.concretes.User;

public interface UserService {
	void add(User user , boolean activate);
	void login(User user , String mail , String password );
}
