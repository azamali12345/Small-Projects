package org.bridgelabz.functionalProgram;
import java.util.Scanner;
public class WindChill 
{
	//FUNCTION TO CALCULATE WINDCHILL
	//ARGUMENT f IS THE double VALUR OF TEMPRATURE IN FAHREINHEIT
	//ARGUMENT ws IS THE double VALUE OF WINDSPEED IN MILE PER HOUR
	static void windChill(double f,double ws) 
	{
		double w=35.74+0.62158*f+(0.4275*f-35.75)*Math.pow(ws,0.16);
		System.out.println(w);
	}

	public static void main(String args[]) 
	{
		Scanner sc= new Scanner(System.in);
		try 
		{
			System.out.println("ENTER TEMPRATURE IN FAHRENHEIT...");
			double f= sc.nextDouble();
			System.out.println("ENTER WIND SPEED IN MILES PER HOUR...");
			double ws=sc.nextDouble();
			if (Math.abs(f)>50 || ws>120 || ws<3) 
			{
				System.out.println("ENTER CORRECT INPUT...");
			} 
			else 
			{
				windChill(f,ws);
			}
		} 
		catch (Exception e) 
		{
			System.out.println("ENTER PROPER INPUT...");
		}
		finally 
		{
		sc.close();
		}
	}
}
