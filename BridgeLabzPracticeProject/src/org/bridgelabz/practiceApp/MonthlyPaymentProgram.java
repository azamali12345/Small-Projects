package org.bridgelabz.practiceApp;
import java.util.*;
public class MonthlyPaymentProgram 
{
	/**
	 * to calculate monthly payment for r interest and p principal for y years
	 *
	 * @param p the principal amount given
	 * @param y the year for which p is given
	 * @param r the rate at which p is given
	 * @return monthly payment
	 */
	//METHOD TO CALCULATE MONTHLY PAYMENT p(PRINCIPAL), r(RATE), y(YEAR) 
	static double monthlyPayment(double p, double y, double r) 
	{
		double y1=12*y;
		double r1=r/(12*100);
		double deno=Math.pow((1+r1),y1);
		double payment=(p*r1)/(1-1/deno);
		return (int)payment;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER PRINCIPAL AMOUNT...");
		double p=sc.nextDouble();
		System.out.println("ENTER YEAR...");
		double y= sc.nextDouble();
		System.out.println("ENTER RATE...");
		double r= sc.nextDouble();
		double result=monthlyPayment(p,y,r);
		System.out.println("MONTHLY PAYMENT IS..."+result);
	}
}
