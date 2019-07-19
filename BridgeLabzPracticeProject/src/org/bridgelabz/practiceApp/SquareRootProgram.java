package org.bridgelabz.practiceApp;
import java.util.Scanner;
public class SquareRootProgram 
{
	//MAIN METHOD
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
			System.out.println("ENTER NUMBER TO FIND SQUARE ROOT...");
			double no=sc.nextDouble();
			System.out.println("SQUARE ROOT IS..."+sqrt(no));
		} 
		catch(Exception e) 
		{
			System.out.println("ENTER INTEGER VALUE..."+e.getMessage());
		}
		finally
		{
			sc.close();
		}
	}
	//FUNCTION TO CALCULATE SQUARE ROOT
	static double sqrt(double c) 
	{
		double t=c;
		double epsilon=1e-15;
		while(Math.abs(t-c/t)>epsilon*t) 
		{
			t=(c/t+t)/2;
		}
		return t;
	}
}
