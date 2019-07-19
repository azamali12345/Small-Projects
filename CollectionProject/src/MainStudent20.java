//Our Own Implementation According To Percentage And Name
//And Our Own Implemention According to ID In Student20 Class
import java.util.*;
public class MainStudent20 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		TreeSet stds=new TreeSet();
		while(true)
		{
			System.out.println("Enter The Name And ID And Percentage...");
			String name=sc.next();
			int id=sc.nextInt();
			double per=sc.nextDouble();
			
			Student20 std=new Student20(name,id,per);
			stds.add(std);
			System.out.println("Do you have More Students...");
			String res=sc.next();
			if(res.equalsIgnoreCase("NO"))
				break;
		}
		System.out.println("<---------STUDENT INFORMATION---------->");
		System.out.println("Based On ID Ascending Order...");
		for(Object obj:stds)
		{
			System.out.println(obj);
		}
		System.out.println("-------------");
		TreeSet tper=new TreeSet(new BasedOnPer());
		tper.addAll(stds);
		System.out.println("Based On Percentage Descending Order...");
		for(Object obj:tper)
		{
			System.out.println(obj);
		}
		System.out.println("---------------");
		
		class BasedAlpha implements Comparator//LOCAL INNER CLASS
		{
			@Override
			public int compare(Object o1, Object o2)
			{
				Student20 s1=(Student20)o1;
				Student20 s2=(Student20)o2;
				if(s1.name.compareTo(s2.name)>0)
					return -1;
				else
					return 1;
			}
			
		}
		
		TreeSet talph=new TreeSet(new BasedAlpha());
		talph.addAll(stds);
		System.out.println("Based On Name Descending  Order....");
		for(Object obj:talph)
		{
			System.out.println(obj);
		}
		}
		

	}

