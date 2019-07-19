import java.util.Scanner;

public class MainExp3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Main Method Started.....");
		System.out.println("Enter The First Number : ");
		String fr=sc.next();
		System.out.println("Enter The Second Number : ");
		String sr=sc.next();
		try
		{
			int a=Integer.parseInt(fr);
			int b=Integer.parseInt(sr);
			System.out.println("Qutient : "+(a/b));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic....");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer......");
		}
		catch(RuntimeException e)
		{
			System.out.println("Runtime.....");
		}
		catch(Exception e)
		{
			System.out.println("Exception......");
		}
		
		System.out.println("Thank You...");
		System.out.println("Main Method Started.......");

	}

}
