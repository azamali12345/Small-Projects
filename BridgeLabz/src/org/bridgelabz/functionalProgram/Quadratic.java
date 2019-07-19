package org.bridgelabz.functionalProgram;
import java.util.Scanner;
public class Quadratic 
{
	//FUNCTION TO FIND THE ROOTS OF EQUATION AND PRINT IT
	static void roots(int a,int b,int c) 
	{
		//CALCULATING DELTA VALUE
		int delta=Math.abs(b*b-4*a*c);
		double x=(-b+Math.sqrt(delta))/(2*a);
		double y=(-b-Math.sqrt(delta))/(2*a);
		System.out.println("VALUE OF x IS... "+x);
		System.out.println("VALUE OF y IS... "+y);
	}
	//MAIN METHOD
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
			System.out.println("ENTER a VALUE...");
			int a= sc.nextInt();
			System.out.println("ENTER b VALUE");
			int b= sc.nextInt();
			System.out.println("ENTER c VALUE");
			int c= sc.nextInt();
			roots(a,b,c);
		} 
		catch (Exception e) 
		{
			System.out.println("ENTER CORRECT INPUT...");
		}
		finally 
		{
		sc.close();
		}
	}
}
