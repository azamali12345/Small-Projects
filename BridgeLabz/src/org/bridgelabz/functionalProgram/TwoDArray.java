package org.bridgelabz.functionalProgram;
import java.io.PrintWriter;
import java.util.Scanner;
public class TwoDArray 
{
	static Scanner sc=new Scanner(System.in);
	//FUNCTION FOR INTEGER ARRAY
	public static int[][] arrayInt(int m,int n) 
	{
		int a[][]= new int[m][n];
		System.out.println();
		System.out.println("INTEGER ARRAY");
		for(int i=0;i<m;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				a[i][j]=sc.nextInt();
			}
		}
		return a;
	}
	//FUNCTION FOR DOUBLE ARRAY
	public static double[][] arrayDouble(int m,int n) 
	{
		double b[][]=new double[m][n];
		System.out.println();
		System.out.println("DOUBLE ARRAY");

		for(int i=0;i<m;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				b[i][j]=sc.nextDouble();
			}
		}
		return b;
	}
	//FUNCTION FOR BOOLEAN ARRAY
	public static String[][] arrayBoolean(int m,int n) {
		String c[][]=new String[m][n];
		System.out.println();
		System.out.println("BOOLEAN ARRAY");

		for (int i=0;i<m;i++) 
		{
			for (int j=0;j<n;j++) 
			{
				c[i][j]=sc.nextLine();
			}
		}
		return c;
	}
	//FUNCTION FOR DISPLAY THE ARRAY
	public static void display(int[][] a,double[][] b,String[][] c,int m,int n) 
	{
		PrintWriter pw=new PrintWriter(System.out,true);
		//FOR PRINT INTEGER
		System.out.println();
		pw.println("2D ARRAY INTEGER");

		for (int i=0;i<m;i++) 
		{
			for (int j=0;j<n;j++) 
			{
				pw.print("\t"+a[i][j]+" ");
			}
			pw.println("\t");
		}
		//FOR PRINT DOUBLE
		System.out.println();
		pw.println("2D ARRAY DOUBLE");

		for (int i=0;i<m;i++) 
		{
			for (int j=0;j<n;j++) 
			{
				pw.print("\t"+b[i][j]+" ");
			}
			pw.println("\t");
		}
		//FOR PRINT BOOLEAN
		System.out.println();
		pw.println("2D ARRAY BOOLEAN");

		for (int i=0;i<m;i++) 
		{
			for (int j=0;j<n;j++) 
			{
				pw.print("\t"+c[i][j]+" ");
			}
			pw.println("\t");
		}
	}
	//GENERIC METHOD FOR DISPLAYING 2D ARRAY
	<t>void displayArray(t[][] arr) 
	{
		PrintWriter pw=new PrintWriter(System.out);
		// display integers
		System.out.println();
		for (int i=0;i<arr.length; i++) 
		{
			for (int j=0;j<arr[i].length;j++) 
			{
				pw.print("\t"+arr[i][j]+" ");
			}
			pw.println("\t");
		}
	}
	//MAIN METHOD
	public static void main(String args[]) 
	{
		System.out.println("ENTER NUMBER OF ROWS...");
		int m=sc.nextInt();
		System.out.println("ENTER NUMBER OF COLUMNS...");
		int n=sc.nextInt();

		//CALLING METHODS STATEMENTS
		int a[][]=arrayInt(m,n);
		double b[][]=arrayDouble(m,n);
		String c[][]=arrayBoolean(m,n);
		display(a,b,c,m,n);
	}
}
