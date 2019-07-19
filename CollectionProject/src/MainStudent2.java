//FIND HIGHEST PERSENTAGE INFORMATION IN Nth NO OF STUDENTS
import java.util.*;
public class MainStudent2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		LinkedList ls=new LinkedList();
		while(true)
		{
			System.out.println("Enter Student ID,Name And Percentage : ...");
			int id=sc.nextInt();
			String name=sc.next();
			double per=sc.nextDouble();
			Student2 std2=new Student2(id,name,per);
			ls.add(std2);
			System.out.println("Do You Have More Students...");
			String res=sc.next();
			if(res.equalsIgnoreCase("NO"))
				break;
		}
		for(Object obj:ls)
		{
			System.out.println(obj);
		}
		System.out.println("Highest Percentage Student Is : ");
		Student2 hs=(Student2)ls.get(0);//DOWNCASTING
		Iterator it=ls.iterator();
		while(it.hasNext())
		{
			/*
			Object obj=it.next();
			Student2 st=(Student2)obj;//DOWNCASTING
			*/
			Student2 st=(Student2)it.next();//DOWNCASTING
			if(hs.per<st.per)
				hs=st;
		}
		System.out.println(hs);
		

	}

}
