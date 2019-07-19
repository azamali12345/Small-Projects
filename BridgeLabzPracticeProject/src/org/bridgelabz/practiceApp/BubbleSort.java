package org.bridgelabz.practiceApp;

import java.util.Scanner;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of integers to sort:");
		int n=sc.nextInt();
		int array[]= new int[n];
		System.out.println("Enter "+n+ " integers: ");
		for(int i=0;i<n;i++) 
		{
			array[i]=sc.nextInt();
		}
		//BUBBLE SORT TECHNIQUE	 
		 for(int i=0;i<n-1;i++) 
		 {
			 for(int j=0;j<n-1;j++) 
			 {
				int k=j+1;
				if (array[j]>array[k])
		        {
		          int temp=array[j];
		          array[j]=array[k];
		          array[k]=temp;
		        }
			 }
		 }
		System.out.println("Sorted list of integers:");
			 
		for(int i=0;i<n;i++) 
		{
			System.out.println(array[i]);
		}
	}
}