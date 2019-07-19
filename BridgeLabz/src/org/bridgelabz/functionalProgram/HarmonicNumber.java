//PROGRAM TO FIND HARMONIC NUMBER
package org.bridgelabz.functionalProgram;
import java.util.Scanner;
public class HarmonicNumber 
{
	 //FUNCTION TO CALCULATE NTH HARMONIC NUMBER
	 //ARGUMENT n IS THE VALUE OF HARMONIC NUMBER
	 //AND RETURN h
	static double harm(int n) 
	{
		double h=0;
		for(double i=1;i<=n;i++) 
		{
			h=h+1/i;
		}
		return h;
	}
	//MAIN METHOD
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		//USING TRY AND CATCH FOR DONT TAKE THE WRONG INPUT
		try 
		{
			System.out.println("ENTER THE HARMONIC NUMBER FIND");
			int no=sc.nextInt();
			System.out.println(harm(no));

		} 
		catch (Exception e) 
		{
			System.out.println("ENTER INTEGER ONLY");
			main(args);
		}
		finally
		{
			sc.close();
		}
	}
}
