import java.util.ArrayList;
import java.util.Scanner;

public class MainExp5 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList cars=new ArrayList();
		while(true)
		{
			System.out.println("Enter The Cars Name : ");
			String name=sc.next();
			cars.add(name);
			System.out.println("Do You Have More...");
			String res=sc.next();
			if(res.equalsIgnoreCase("NO"))
				break;
		}
		System.out.println(cars);
	}

}
