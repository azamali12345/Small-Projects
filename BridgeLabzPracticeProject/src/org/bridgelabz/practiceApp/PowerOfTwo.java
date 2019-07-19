//PRINT THE TABLE POWER OF TWO N TIMES OF TWO
package org.bridgelabz.practiceApp;
import java.util.Scanner;
public class PowerOfTwo 
{
	//FUNCTION TO PRINT THE POWER TABLE OF 2 n TIMES OF TWO IS PRINTED
	static void printPowerTable(int pow) 
	{
		int val=1;
		for (int i=1;i<=pow;i++) 
		{
			val=val*2;
			System.out.println(val);
		}
	}
	//MAIN METHOD
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER TO FIND POWER OF 2 LESS THAN 32...");
		int pow=sc.nextInt();
		while(pow>31) 
		{
			System.out.println("INVALID INPUT...");
			System.out.println("ENTER THE VALUE LESS THAN 32...");
			pow=sc.nextInt();
		}
		printPowerTable(pow);
	}
}
