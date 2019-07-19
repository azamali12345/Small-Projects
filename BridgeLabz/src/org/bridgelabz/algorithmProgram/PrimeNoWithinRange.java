//PROGRAM TO DISPLAY PRIME NUMBER WITHIN THE RANGE
package org.bridgelabz.algorithmProgram;
public class PrimeNoWithinRange 
{
	public static void main(String args[]) 
	{
		System.out.println("PRIME BETWEEN 0 TO 1000...");
		prime();
	}
	public static void prime() 
	{
		System.out.println();
		boolean b;
		for (int j=2;j<=1000;j++) 
		{
			b=true;
			for(int i=2;i<=j/2;i++) 
			{
				if(j%i==0) 
				{
					b=false;
					break;
				}
			}
			if(b)
				System.out.print(j+ " ");
		}
	}
}
