package org.bridgelabz.practiceApp;
import java.util.Scanner;
public class TempratureConversionProgram
{
	//FUNCTION TO COVERT TEMPRATURE IN FAHRENHEIT TO CELSIUS
	static int temperaturConversion(int temp,char t) 
	{
		int convert;
		if (t=='c' || t=='C') 
		{
			convert=(temp*9/5)+32;
		} 
		else if(t=='f' || t=='F') 
		{
			convert=(temp-32)*5/9;
		} 
		else 
		{
			System.out.println("ENTER CORRECT INPUT...");
			return 0;
		}
		return convert;
}
	//MAIN METHOD
	public static void main(String[] args) 
	{
		try 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER TEMPRATURE IN 'N' 'C' 'OR' 'F'");
			int temp=sc.nextInt();
			char t=sc.next().charAt(0);
			if(t!='f' && t!='F' && t!='c' && t!='C') 
			{
				System.out.println("ENTER CORRECT INPUT...");
				main(args);
				return;
			}
			temp=temperaturConversion(temp,t);
			System.out.println("CONVERTED TEMP IS... "+temp);
		} 
		catch (Exception e) 
		{
			System.out.println("TEMPRATUREMIN IN FORMAT 45 c");
		}
	}
}