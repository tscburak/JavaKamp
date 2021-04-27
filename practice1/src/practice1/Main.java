package practice1;

public class Main {

	public static void main(String[] args) {
		
		int i=1;
		
		Course course1 = new Course("JAVA React","Engin Demiroð",32,1);
		Course course2 = new Course("C# Angular","Engin Demiroð",14,2);
		Course course3 = new Course("Programlamaya Giriþ Temel Kurs","Engin Demiroð",0,3);
		Course[] courses = {course1,course2,course3};
		
		Category category1 = new Category(1,"Tümü",3);
		Category category2 = new Category(2,"Programlama",3);
		Category[] categories = {category1,category2};
		
		CourseManager courseManager = new CourseManager();
		Attendance attendance = new Attendance();
		
		
		
		for (Course course : courses)		//Course List Tester
		{
			System.out.println("Course " + i + ":");
			System.out.println("Id:" + course.courseId);
			System.out.println(course.courseName);
			System.out.println(course.courseTeacher);
			System.out.println(course.courseProgress + "\n---------------");
			i++;
			
		}
		
		System.out.println("\n");
		
		for(Category category : categories)			//Category List Tester
		{
			System.out.println("Id: " + category.id);
			System.out.println("Category: " + category.categoryName);
			System.out.println("Quantity: " + category.quantity + "\n---------------");
			
		}
		
		System.out.println("\n");
		
		for(Course course : courses)		//Method1 Tester 
		{
			courseManager.addCourse(course);
			
		}
		
		System.out.println("\n");
		
		
		for(i=1 ; i<=10 ; i++)				//Method2 Tester
		{
			attendance.takeAttendance(i);
		}
		
		
		
	}

}
