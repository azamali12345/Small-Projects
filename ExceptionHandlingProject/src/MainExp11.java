import java.io.IOException;
import java.util.Scanner;

public class MainExp11 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a<0||b<0)
			throw new NullPointerException("Negative Number...");
		if(a==0||b==0)
		try
		{
		throw new IOException("Number Is Zero...");		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}
		
		int p=a*b;
		System.out.println("Product Of Two Number Is : "+p);

	}

}
