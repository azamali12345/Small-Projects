import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class MainExp14 
{
	static int product(int a,int b)throws SQLException,IOException
	{
		if(a<0||b<0)
			throw new SQLException("Negativ Number...");
		if(a==0||b==0)
			throw new IOException("Number Is Zero...");
		int p=a*b;
		return p;
	}
	public static void main(String[] args) throws SQLException, Exception //Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int p=product(a,b);
		System.out.println("Product Of Two Number Is : "+p);
	}

}
