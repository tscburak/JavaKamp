package week2;

public class Course {

	public Course()
	{
		System.out.println("Course class has been executed");
	}
	
	public Course(String courseName,String courseTeacher, int courseProgress, int courseId)
	{
		this.courseId=courseId;
		this.courseName=courseName;
		this.courseTeacher=courseTeacher;
		this.courseProgress=courseProgress;
		
	}
	
	String courseName;
	String courseTeacher;
	int courseProgress;
	int courseId;
	
	
	
}
