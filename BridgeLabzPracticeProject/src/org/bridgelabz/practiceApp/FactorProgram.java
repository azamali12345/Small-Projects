//PROGRAM TO FIND THE PRIME FACTORS OF GIVEN NUMBER
package org.bridgelabz.practiceApp;
import java.util.*;
public class FactorProgram 
{
	//FUNCTION TO CHECK IF THE NUMBER IS PRIME OR NOT
	//ARGUMENT n IS THE NUMBER TO CHECK FOR PRIME
	public static boolean isPrime(int n) 
	{
		for (int i=2;i<=n/2;i++) 
		{
			if(n%i==0) 
			{
			return false;
			}
		}
	return true;
	}
	
	//FUNCTION TO FIND THE PRIME FACTORS OF GIVEN NUMBER AND PRINT IT
	//ARGUMENT n NUMBER FOR WHICH to FIND THE PRIME FACTORS
	static void primeFactors(int n) 
	{
		for (int i=2;i<=n;i++) 
		{
			int t=n%i;
				if(t==0) 
				{
					if(isPrime(i))
						System.out.println(i+ " ");
				}
		}
	}
	//MAIN METHOD
	public static void main(String args[]) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER NUMBER TO FIND FACTORS...");
		int n= sc.nextInt();
		System.out.println("PRIME FACTORS ARE");
		primeFactors(n);
		// System.out.println(isPrime(n));
	}
}
