package org.pattern_App;

import java.util.Scanner;

public class Pattern4 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the No");
int n=sc.nextInt();
for (int i = 0; i <n; i++)
{
for (int j = 0; j <n; j++) 
{
if(j<=i&&j+i<=n-1||i+j>=n-1&&j>=i)

	System.out.print("*");
else
	System.out.print(" ");
	
}
System.out.println();
}
}
}