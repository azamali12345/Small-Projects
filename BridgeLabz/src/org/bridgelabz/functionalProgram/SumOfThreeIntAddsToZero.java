package org.bridgelabz.functionalProgram;
import java.util.Scanner;
public class SumOfThreeIntAddsToZero 
{
	static Scanner sc=new Scanner(System.in);
	//FUNCTION TO CHECK SUM OF TRIPLES IS ZERO
	//ARGUMENT n IS NUMBER OF ELEMENT TO CHECK FOR ARRAYS CRAETION
	static void sumOfCount(int n) 
	{
		int arr[]=new int[n];
		int count=0;
		System.out.println("ENTER VALUES...");
		//TAKING INTEGER INPUT FOR CREATING ARRAY
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		//CHECKING THE TRIPLETS BY LOOP
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				for (int k=j+1;k<arr.length;k++) 
				{
					if (arr[i]+arr[j]+arr[k]==0) 
					{
						count++;
						System.out.println(arr[i]+"+"+arr[j]+"+"+arr[k]+"="+"0");
					}
				}
			}
		}
		System.out.println("TOTAL PAIRS ARE..."+count);
	}
	public static void main(String args[]) 
	{
		System.out.println("ENTER NUMBER OF INPUTS ARE...");
		int n=sc.nextInt();
		sumOfCount(n);
	}
}
