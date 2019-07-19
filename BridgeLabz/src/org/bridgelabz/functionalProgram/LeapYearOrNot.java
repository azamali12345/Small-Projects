//GIVEN NUMBER IS LEAP YEAR OR NOT PROGRAM
package org.bridgelabz.functionalProgram;
import java.util.Scanner;
public class LeapYearOrNot 
{
	//MAIN METHOD
	public static void main(String args[]) 
	{
		int year;
		System.out.println("ENTER THE YEAR...");
	    Scanner sc=new Scanner(System.in);
	    year=sc.nextInt();
	    if(((year%4==0)&&(year%100!=0))||(year%400==0))
	    	System.out.println(year+" IS LEAP YEAR");
	    else
	    	System.out.println(year+" IS NOT A LEAP YEAR");
	}

}
