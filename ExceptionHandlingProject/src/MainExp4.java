import java.util.Scanner;
public class MainExp4 
{
	public static void main(String[] args) 
	{
		
			Scanner sc=new Scanner(System.in);	
			System.out.println("Main Method Started.....");
			int arr[]={10,20,30,5,0,60,70,80};
			System.out.println("Enter The Two Index...");
			int i=sc.nextInt();
			int j=sc.nextInt();
			try
			{
				int q=arr[i]/arr[j];
				System.out.println("Quetient is "+q);
			}
			catch(ArithmeticException |ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Either Arithmetic or ArrayIndex Exception is Occured....");
			}
			catch(Exception e)
			{
				System.out.println("Exception.....");
			}
			System.out.println("Thank You...");
			System.out.println("Main Method End.......");

			}

	}


