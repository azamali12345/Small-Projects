package org.bridgelabz.functionalProgram;
import java.util.Scanner;
public class Distance 
{
	//FUNCTION TO CALCULATE THE VALUE OF DISTANCCE
	//ARGUMENT x IS THE x AXIS
	//ARGUMENT y IS THE y AXIS
	static void calculate(int x, int y) 
	{
		System.out.println("DISTANCE IS..."+Math.sqrt(x*x+y*y));
	}
	//MAIN METHOD
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
			System.out.println("ENTER VALUE FOR x... ");
			int x=sc.nextInt();
			System.out.println("ENTER VALUE FOR y... ");
			int y=sc.nextInt();
			calculate(x,y);
			
		} 
		catch (Exception e) 
		{
			System.out.println("ENTER ONLY INTEGER VALUE...");
		}
		finally
		{
			sc.close();
		}
	}
}
