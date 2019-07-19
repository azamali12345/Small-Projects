import java.util.Scanner;

public class MainExp7 
{

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Main Method Started.....");
		String str=null;
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		try
		{
			if(n<=1)
			{
				System.exit(0);
			}
		}
		finally
		{
			System.out.println("I Am Finally Block.......");
		}
		System.out.println("Thank You....");
		System.out.println("Main Method End......");

	}

}
