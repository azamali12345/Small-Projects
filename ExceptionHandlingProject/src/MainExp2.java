import java.util.Scanner;

public class MainExp2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Main Method Started.....");
	int arr[]={45,55,65,75,5,0,85,95};
	System.out.println("Enter The Two Index...");
	int i=sc.nextInt();
	int j=sc.nextInt();
	try
	{
		int q=arr[i]/arr[j];
		System.out.println("Quetient is "+q);
	}
	catch(ArithmeticException e)
	{
		System.out.println(j+" Index value is "+arr[j]);
		System.out.println("This Index Value Must Not be Zero.....");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Index Not In the RANGE ");
		System.out.println("It Should Between "+0+" to "+(arr.length-1));
	}
	System.out.println("Thank You...");
	System.out.println("Main Method End.......");

	}

}
