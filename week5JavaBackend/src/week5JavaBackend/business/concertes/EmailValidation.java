package week5JavaBackend.business.concertes;

import week5JavaBackend.business.abstracts.ValidationService;
import java.util.regex.*;
public class EmailValidation implements ValidationService{

	@Override
	public boolean validation(String mail) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mail);
		if(matcher.matches()){
			return true;
		}
		else {
			return false;
		}
		
	}
	

}
