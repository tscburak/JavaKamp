package week3;

public class InstructorManager extends UserManager {
	
	public void addAssignment(Instructor instructor) {
		System.out.println(instructor.name +" "+instructor.surname+ " added new assignment");
	}
	
	public void removeAssignment(Instructor instructor) {
		System.out.println(instructor.name +" "+instructor.surname+ " removed the assignment");
	}

}
