import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class MainEmployee
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
		while(true)
		{
			System.out.println("Enter EMP ID, EMP NAME, EMP SALARY");
			int id=sc.nextInt();
			String name=sc.next();
			double sal=sc.nextDouble();
			
			Employee emp=new Employee(id,name,sal);
			al.add(emp);
			System.out.println("DO YOU HAVE MORE EMPLOYEES...");
			String res=sc.next();
			if(res.equalsIgnoreCase("NO"))
				break;
		}
		System.out.println(al);
		System.out.println("--------------");
		
		//USING FOR LOOP
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("-----------");
		
		//USING FOR EACH LOOP
		for(Object obj:al)
		{
			System.out.println(obj);
		}
		System.out.println("-----------");
		
		//USING CONVERT COLLECTION TO ARRAY
		Object obj[]=al.toArray();
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]);
		}
		System.out.println("-----------");
		
		//USING ITERATOR
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("-----------");
		
		//Using LISTITERATOR
		ListIterator lit=al.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		System.out.println("-----------");
		//REVERESS
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		System.out.println("-----------");
	}

}
