package JavaPackage.Q1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendar 
{

	public MyCalendar()
	{
		
		
		
	}
	
	public MyCalendar(int a, int b, int c)
	{
		
		this.userDay = a;
		this.userMonth = b;
		this.userYear = c;
		
	}
	
	public void setDate()
	{
		
		Calendar calendar = new GregorianCalendar();
		calendar.set(Calendar.DAY_OF_MONTH, userDay);
		calendar.set(Calendar.MONTH, (userMonth - 1));
		calendar.set(Calendar.YEAR, userYear);
		weekDate = calendar.get(Calendar.DAY_OF_WEEK);
	}
	
	public String getWeekDate()
	{
		
		
		if(weekDate == 1)
			return "Sunday";
		else if(weekDate == 2)
			return "Monday";
		else if(weekDate == 3)
			return "Tuesday";
		else if(weekDate == 4)
			return "Wednesday";
		else if(weekDate == 5)
			return "Thursday";
		else if(weekDate == 6)
			return "Friday";
		else if(weekDate == 7)
			return "Saturday";
		else
			return "error";
		
		
		
				
		
	}
	
	private int userDay;
	private int userMonth;
	private int userYear;
	private Calendar calendar;
	private int weekDate;
}
