package week3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		Student student = new Student();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		instructor.setId(1);
		instructor.setName("Engin");
		instructor.setSurname("Demiroğ");
		instructor.setDetails("Microsoft Certified Trainer (MCT) ,PMP and ITIL");
		
		
		student.setId(2);
		student.setName("Burak");
		student.setSurname("Taşçı");
		student.setCourse("JAVA");
		

		instructorManager.Add(instructor);
		instructorManager.addAssignment(instructor);
		studentManager.Add(student);
		studentManager.joinedTheCourse(student);
		
		
		
		

	}

}
