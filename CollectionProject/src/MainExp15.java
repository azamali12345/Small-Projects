import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class MainExp15 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		HashSet students=new HashSet();
		while(true)
		{
			System.out.print("Enter The ID And Name And Percentage Of the Student...");
			
			int id=sc.nextInt();
			String name=sc.next();
			double per=sc.nextDouble();
			
			Student15 std=new Student15(id,name,per);
			boolean rs=students.add(std);
			if(rs==false)
				System.out.println("Student ID is allready register...");
			System.out.println("Do You Have More Students...");
			String res=sc.next();
			if(res.equalsIgnoreCase("NO"))
				break;
		}
		System.out.println("<--------Student Information---------->");
		
		Iterator it=students.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
