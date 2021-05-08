package week5JavaBackend.business.concertes;

import week5JavaBackend.business.abstracts.ActivationService;
import week5JavaBackend.entities.concretes.User;

public class ActivationManager implements ActivationService{

	@Override
	public void sendMail(User user) {
		System.out.println("The activation mail has been sended to your mail. Please check the mailbox, and click the activation link");
		
	}

	@Override
	public boolean checkActivate(boolean activate) {
		
		return activate;
	}

	
}
