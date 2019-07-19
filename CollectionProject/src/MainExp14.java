import java.util.*;
public class MainExp14 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		HashSet customers=new HashSet();
		while(true)
		{
			System.out.print("Enter The Name And Mobile Number Of The Customer...");
			String name=sc.next();
			long mob=sc.nextLong();
			
			Customer14 cust=new Customer14(name,mob);
			boolean rs=customers.add(cust);
			if(rs==false)
				System.out.println("Customer Mobile Number Already Register...");
			System.out.println("Do You Have More Customers...");
			String res=sc.next();
			if(res.equalsIgnoreCase("NO"))
				break;
		}
		System.out.println("<--------Customers Information---------->");
		
		Iterator it=customers.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
