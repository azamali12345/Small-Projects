//THERE IS 1,2,5,10,50,500,1000,2000 RS NOTES WHICH CAN BE RETURNED BY VENDING MACHINE.
package org.bridgelabz.algorithmProgram;
import java.util.Scanner;
public class VendingMachine 
{
	int mNote;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE AMOUNT...:");
		int amount=sc.nextInt();
		VendingMachine vm=new VendingMachine();
		vm.calculateMinNoNote(amount);
		System.out.println("MINIMUM NUMBER OF NOTES REQUIRED IS..."+vm.mNote);
	}
	//FUNCTION OF VENDING MACHINE
	public void calculateMinNoNote(int amount)
	{
		//System.out.println("Amount is : "+amount);
		if(amount==0)
		{
			return;
		}
		//CALCULATE 2000 RS NOTES
		if(amount>=2000)
		{
			mNote+=((int)amount/2000);
			System.out.println("2000 RUPEES NOTES IS: "+((int)amount/2000));
			if(amount/2000==0)
				return;
			else
				calculateMinNoNote(amount%2000);
		}
		//CALCULATE 1000 RS NOTES
		else if(amount>=1000)
		{
			mNote+=((int)amount/1000);
			System.out.println("1000 RUPEES NOTES IS: "+((int)amount/1000));
			if(amount/1000==0)
				return;
			else
				calculateMinNoNote(amount%1000);
		}
		//CALCULATE 500 RS NOTES		
		else if(amount>=500)
		{
			mNote+=((int)amount/500);
			System.out.println("500 RUPEES NOTES IS: "+((int)amount/500));
			if(amount/500==0)
				return;
			else
				calculateMinNoNote(amount%500);
		}
		//CALCULATE 200 RS NOTES
		else if(amount>=200)
		{
			mNote+=((int)amount/200);
			System.out.println("200 RUPEES NOTES IS: "+((int)amount/200));
			if(amount/200==0)
				return;
			else
				calculateMinNoNote(amount%200);
		}
		//CALCULATE 100 RS NOTES
		else if(amount>=100)
		{
			mNote+=((int)amount/100);
			System.out.println("100 RUPEES NOTES IS: "+((int)amount/100));
			if(amount/100==0)
				return;
			else
				calculateMinNoNote(amount%100);
		}
		//CALCULATE 50 RS NOTES
		else if(amount>=50)
		{
			mNote+=((int)amount/50);
			System.out.println("50 RUPEES NOTES IS: "+((int)amount/50));
			if(amount/50==0)
				return;
			else
				calculateMinNoNote(amount%50);
		}
		//CALCULATE 20 RS NOTES
		else if(amount>=20)
		{
			mNote+=((int)amount/20);
			System.out.println("20 RUPEES NOTES IS: "+((int)amount/20));
			if(amount/20==0)
				return;
			else
				calculateMinNoNote(amount%20);
		}
		//CALCULATE 10 RS NOTES
		else if(amount>=10)
		{
			mNote+=((int)amount/10);
			System.out.println("10 RUPEES NOTES IS: "+((int)amount/10));
			if(amount/10==0)
				return;
			else
				calculateMinNoNote(amount%10);
		}
		//CALCULATE 5 RS NOTES
		else if(amount>=5)
		{
			mNote+=((int)amount/5);
			System.out.println("5 RUPEES NOTES IS: "+((int)amount/5));
			if(amount/5==0)
				return;
			else
				calculateMinNoNote(amount%5);
		}
		//CALCULATE 2 RS NOTES
		else if(amount>=2)
		{
			mNote+=((int)amount/2);
			System.out.println("2 RUPEES NOTES IS: "+((int)amount/2));
			if(amount/2==0)
				return;
			else
				calculateMinNoNote(amount%2);
		}
		//CALCULATE 1 RS NOTES
		else if(amount>=1)
		{
			mNote+=((int)amount/1);
			System.out.println("1 RUPEES NOTES IS: "+((int)amount/1));
			if(amount/1==0)
				return;
			else
				calculateMinNoNote(amount%1);
		}
	}
}
