package org.bridgelabz.functionalProgram;
import java.util.Scanner;
public class StopWatch 
{
	//USE STATIC VARIABLE FOR STORE THE VALUE start AND end TIME
	static double start=0;
	static double stop=0;
	//FUNCTION TO PUT START TIME AND PRINT IT
	static void startTime() 
	{
		start=System.currentTimeMillis();
		System.out.println("STARTED AT..."+start);
	}
	//FUNCTION TO PUT STOP TIME AND PRINT IT
	static void stopTime() 
	{
		stop = System.currentTimeMillis();
		System.out.println("STOPPED AT..."+stop);
	}
	//FUNCTION TO CALCULATE ELAPESED TIME AND PRINT IT
	static void elapsedTime() 
	{
		System.out.println("ELAPESED TIME IS..."+(stop-start)/1000);
	}
	//MAIN METHOD
	public static void main(String args[]) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER 1 TO START...");
		sc.next();
		startTime();
		System.out.println("ENTER TO STOP...");
		sc.next();
		stopTime();
		elapsedTime();
	}
}
