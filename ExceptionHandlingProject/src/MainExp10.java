import java.util.Scanner;
public class MainExp10 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Main Method Started.....");
		System.out.println("Ente The Age : ");
		int age=sc.nextInt();
		try
		{
			if(age<18)
				throw new NullPointerException("You can VOTE for ABC Party...");
			System.out.println("You Can VOTE to PQR Party...");
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage()+" next "+(18-age)+" years");
			System.out.println("Then you should VOTE XYZ to better India...");
		}
		System.out.println("Thank You...");
		System.out.println("Main Method End......");
		

	}

}
