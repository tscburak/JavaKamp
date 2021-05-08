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
		UserService userManage = new UserManager(new EmailValidation(), new HibernateUserDao(), new ActivationManager()); //UserManager için gerekli olan parametrelerin girilmesi
		User user = new User(1,"Burak","Taþçý","buraktasci2001@outlook.com","123456789"); //User'ýn tanýmlanmasý
		LoginService loginService = new GoogleServiceAdapters(); //GoogleLogin in Adapter ile baðlanmasý
		
		userManage.add(user, true);    // Link aktivasyon durumunu belirten "activate" deðiþkenine true-false deðer göndererek aktivasyonu test etmesi
		userManage.login(user, "buraktasci2001@outlook.com", "123456789"); //Kayýt bilgileriyle sisteme giriþ yapýlmasý
		loginService.login("buraktasci2001@gmail.com", "123456789"); //Adapter ile eklenen GoogleLogin'in test edilmesi
		
		
	}


	
}
