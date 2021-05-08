package week5JavaBackend.business.concertes;

import week5JavaBackend.business.abstracts.ActivationService;
import week5JavaBackend.business.abstracts.UserService;
import week5JavaBackend.business.abstracts.ValidationService;
import week5JavaBackend.dataAccess.abstracts.UserDao;
import week5JavaBackend.entities.concretes.User;



public class UserManager implements UserService {
	public boolean activate; 	
	private ValidationService validation;
	private UserDao userDao;
	private ActivationService activationService;
	
	
	public UserManager(ValidationService validation, UserDao userDao, ActivationService activationService) {
		this.validation = validation;
		this.userDao = userDao;
		this.activationService = activationService;
	}


	@Override
	public void add(User user , boolean activate) {
		this.activate=activate;
		if(user.getFirstName().length() < 2 | user.getLastName().length() < 2
				| user.getPassword().length()< 6 | !validation.validation(user.getMail())) {
			System.out.println("Your information(s) is/are invalid.");
			return;
		}
		activationService.sendMail(user);
		if(activationService.checkActivate(activate)) {
			userDao.add(user);
		}
		else {
			System.out.println("You didn't click the link.");
		}
		
		
	}


	@Override
	public void login(User user, String mail, String password) {
		if(mail.equals(user.getMail())&& password.equals(user.getPassword()) && activationService.checkActivate(activate)){
			System.out.println("Succesfully logined!");
			}
		else {
			System.out.println("Mail or password is wrong.");
		}
		
	}

}
