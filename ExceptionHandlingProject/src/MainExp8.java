import java.util.Scanner;

public class MainExp8 
{

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Main Method Started.....");
		String str=null;
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		if(n==1)
		{
			str="Raghu";
		}
		try
		{
			System.out.println("Number Of Characters : "+str.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic...");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer...");
		}
		finally
		{
			System.out.println("I Am Finally Block.......");
		}
		System.out.println("Thank You....");
		System.out.println("Main Method End......");

	}

}


