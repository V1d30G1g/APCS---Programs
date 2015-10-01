package JavaPackage.Q1;

import java.util.Calendar;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int numTests = scan.nextInt();
		System.out.println(Calendar.SUNDAY);
		for(int i = 0; i < numTests; i++)
		{ 
			
			System.out.println("Please enter the day of the month: ");
			int day = scan.nextInt();
			
			System.out.println("Please enter the month: ");
			int month = scan.nextInt();
			
			
			System.out.println("Please enter the year: ");
			int year = scan.nextInt();
			
			MyCalendar calendar = new MyCalendar(day, month, year);
			
			calendar.setDate();
			
			System.out.println(day + " " + month + " " + year);
			
			System.out.println(calendar.getWeekDate());
			
		}
		
		scan.close();

	}

}
