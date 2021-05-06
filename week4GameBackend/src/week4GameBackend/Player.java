package week4GameBackend;

public class Player {

	
private int id;
private String nickname;
private String firstName;
private String lastName;
private DateOfBirth dateOfBirth;
private String mail;
private String nationalId;

public Player(int id, String nickname, String firstName, String lastName, DateOfBirth dateOfBirth, String mail,
		String nationalId) {
	
	this.id = id;
	this.nickname = nickname;
	this.firstName = firstName;
	this.lastName = lastName;
	this.dateOfBirth = dateOfBirth;
	this.mail = mail;
	this.nationalId = nationalId;
	
	}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNickname() {
	return nickname;
}

public void setNickname(String nickname) {
	this.nickname = nickname;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getDateOfBirth() {
	return dateOfBirth.year+ "/" +dateOfBirth.month + "/" + dateOfBirth.day ;
}

public int getDateOfBirthYear() {
	return dateOfBirth.year;
}

public int getDateOfBirthMonth() {
	return dateOfBirth.month;
}

public int getDateOfBirthDay() {
	return dateOfBirth.day;
}

public void setDateOfBirth(DateOfBirth dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}

public String getNationalId() {
	return nationalId;
}

public void setNationalId(String nationalId) {
	this.nationalId = nationalId;
}


}
