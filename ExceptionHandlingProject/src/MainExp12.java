//Exception Propogation
public class MainExp12 
{
	int a,b ;
	static void divide(int a,int b)
	{
		System.out.println("Divide Methid Started....");
		System.out.println("First Value Is.....");
		System.out.println("Second Value Is.....");
		int q=a/b;
		System.out.println("Qutient Is : "+q);
		System.out.println("Devide Method End....");
	}
	static void div(int a,int b) 
	{
		System.out.println("Div Method Started...");
		divide(a,b);
		System.out.println("Div Method End...");
	}
	public static void main(String[] args)
	{
		System.out.println("Main Method Started...");
		try
		{
			div(8,2);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Main Method End....");
	}
}
