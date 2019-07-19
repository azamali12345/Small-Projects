//Using for loop and for-each loop and convert colletion to array
import java.util.ArrayList;
import java.util.Scanner;

public class MainStudent 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList(5);
		while(true)
		{
			System.out.println("Enter ID,Name And Percentage : ");
			int id=sc.nextInt();
			String name=sc.next();
			double per=sc.nextDouble();
			Student std=new Student(id,name,per);
			al.add(std);
			System.out.println("Do You Have More Students...");
			String res=sc.next();
			if(res.equalsIgnoreCase("no"))
				break;
		}
		System.out.println(al);
		System.out.println("----------------");
		
		//Using for loop
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("----------------");
		
		//Using for-each-loop
		for(Object obj:al)
		{
			System.out.println(obj);
		}
		System.out.println("----------------");
		
		//Using COnvert Collection to Array
		Object obj[]=al.toArray();
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]);
		}
	}

}
