package org.bridgelabz.practiceApp;
import java.util.Scanner;
public class DayOfWeek 
{
	static String str[]={"Sunday","Monday","tuesday","Wednesday","Thursday","Friday","Saturday"};
	//MAIN METHOD
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER DAY...");
		int day=sc.nextInt();
		System.out.println("ENTER MONTH...");
		int month=sc.nextInt();
		System.out.println("ENTER YEAR...");
		int year=sc.nextInt();
		
		//FUNCTION TO CALL PRINT DAY OF THE WEEK
		System.out.println(dayOfWeek(day,month,year));
	}
	//FUNCTION TO CALCULATE DAY OF THE WEEK AND RETURN
	static public String dayOfWeek(int d, int m, int y) 
	{
		int y0=y-(14-m)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=m+12*((14-m)/12)-2;
		int d0=(d+x+(31*m0)/12)%7;
		return str[d0];
	}
}
