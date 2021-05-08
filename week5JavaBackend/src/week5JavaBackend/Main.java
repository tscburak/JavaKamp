package week5JavaBackend;

import week5JavaBackend.business.abstracts.UserService;
import week5JavaBackend.business.concertes.ActivationManager;
import week5JavaBackend.business.concertes.EmailValidation;
import week5JavaBackend.business.concertes.UserManager;
import week5JavaBackend.core.GoogleServiceAdapters;
import week5JavaBackend.core.LoginService;
import week5JavaBackend.dataAccess.concretes.HibernateUserDao;
import week5JavaBackend.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userManage = new UserManager(new EmailValidation(), new HibernateUserDao(), new ActivationManager()); //UserManager i�in gerekli olan parametrelerin girilmesi
		User user = new User(1,"Burak","Ta���","buraktasci2001@outlook.com","123456789"); //User'�n tan�mlanmas�
		LoginService loginService = new GoogleServiceAdapters(); //GoogleLogin in Adapter ile ba�lanmas�
		
		userManage.add(user, true);    // Link aktivasyon durumunu belirten "activate" de�i�kenine true-false de�er g�ndererek aktivasyonu test etmesi
		userManage.login(user, "buraktasci2001@outlook.com", "123456789"); //Kay�t bilgileriyle sisteme giri� yap�lmas�
		loginService.login("buraktasci2001@gmail.com", "123456789"); //Adapter ile eklenen GoogleLogin'in test edilmesi
		
		
	}


	
}
