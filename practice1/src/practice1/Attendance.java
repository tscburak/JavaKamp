package practice1;

public class Attendance {
	
	public void takeAttendance(int week) {
		String ord;
		
		if (week%10==1 & (week >20 | week<10))
		{
			ord="st";
		}
		else if (week%10==2 & (week >20 | week<10))
		{
			ord="nd";
		}
		else if (week%10==3 & (week >20 | week<10))
		{
			ord="rd";
		}
		else
		{
			ord="th";
		}
		
		System.out.println(week + ord +" Week attendance has been taken. You can back to the course.");
		
	}

}
