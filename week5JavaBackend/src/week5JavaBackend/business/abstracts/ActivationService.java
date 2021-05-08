package week5JavaBackend.business.abstracts;

import week5JavaBackend.entities.concretes.User;

public interface ActivationService {
	void sendMail(User user);
	boolean checkActivate(boolean activate);

}
