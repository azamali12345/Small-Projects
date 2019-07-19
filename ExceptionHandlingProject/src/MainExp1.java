import java.util.Scanner;

public class MainExp1 {

	public static void main(String[] args) 
	{
	System.out.println("Main Method Started.......");	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Two Numbers : ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("First Value Of "+a);
	System.out.println("Second Value Of "+b);
	try
	{
		double q=a/b;
		System.out.println("Qutient : "+q);
	}
	catch(ArithmeticException e)
	{
	System.out.println("Second Value Must Not Be Zero...");	
	}
	System.out.println("Thank You.....");
	System.out.println("Main Method End....");
	}

}
