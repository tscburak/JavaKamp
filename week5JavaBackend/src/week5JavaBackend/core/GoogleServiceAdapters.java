package week5JavaBackend.core;

import week5JavaBackend.GoogleLogin.GoogleLogin;

public class GoogleServiceAdapters implements LoginService {

	@Override
	public void login(String mail, String password) {
		GoogleLogin gLogin = new GoogleLogin();
		gLogin.loginWithGoogle(mail, password);
		
	}

}
