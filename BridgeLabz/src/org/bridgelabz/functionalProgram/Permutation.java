package org.bridgelabz.functionalProgram;
import java.util.Scanner;
public class Permutation
{
	static int c=0;
	static void input() throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER A WORD...");
		String s=sc.next();
		System.out.println("THE PERMUTATIONS ARE...");
		display("",s);
		System.out.println("TOTAL NUMBER OF PERMUTATION = "+c);
	}
	static void display(String s1,String s2) 
	{
		if(s2.length()<=1) 
		{
			c++;
			System.out.println(s1+s2);
		} 
		else 
		{
			for(int i=0;i<s2.length();i++) 
			{
				String x=s2.substring(i,i+1);
				String y=s2.substring(0,i);
				String z=s2.substring(i+1);
				display(s1+x,y+z);
			}
		}
	}
	//MAIN METHOD
	public static void main(String args[])throws Exception 
	{
		input();
	}
}
