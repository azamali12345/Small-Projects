package org.btm.practiceApp;
import java.util.Scanner;
public class Pattern 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sp=n/2;
		int ele=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			int no=1;
			for(int k=1;k<=ele;k++)
			{
				System.out.print(no+"");
				if(k<=ele/2)
					no++;
				else
					no--;
			}
			if(i<=n/2)
			{
				sp--;
				ele=ele+2;
			}
			else
			{
				sp++;
				ele=ele-2;
			}
			System.out.println();		
		}
		
	}
			
}
