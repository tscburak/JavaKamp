package week3;

public class StudentManager extends UserManager{
	
	public void joinedTheCourse(Student student) {
		System.out.println(student.name + " " +student.surname +" has joined the " + student.course + " course.");
	}
	
	public void leftTheCourse(Student student) {
		System.out.println(student.name + " " +student.surname + " has left the " + student.course+ " course.");
	}

}
