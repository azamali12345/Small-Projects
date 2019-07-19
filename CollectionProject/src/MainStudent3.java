import java.util.*;

//FIND HIGHEST PERSENTAGE INFORMATION IN Nth NO OF STUDENTS USING METHOD
public class MainStudent3 
{
	static Student getBestStudent(Collection stds)
	{
		Student hs=null;
		for(Object obj:stds)
		{
			if(hs==null)
			{
				hs=(Student)obj;
			}
			else
			{
				Student st=(Student)obj;
				if(st.per>hs.per)
				hs=st;
			}
		}
	return hs;
	}
	static Collection readStudentsInfo()
	{
		Scanner sc=new Scanner(System.in);
		LinkedList ls=new LinkedList();
		while(true)
		{
			System.out.println("Enter Student ID,Name And Percentage : ...");
			int id=sc.nextInt();
			String name=sc.next();
			double per=sc.nextDouble();
			Student std=new Student(id,name,per);
			ls.add(std);
			System.out.println("Do You Have More Students...");
			String res=sc.next();
			if(res.equalsIgnoreCase("NO"))
				break;
		}
		return ls;
		
	}
	public static void main(String[] args) 
	{
		Collection students=readStudentsInfo();
		for(Object obj:students)
		{
			System.out.println(obj);
		}
		System.out.println("Heghest Percentage Student Is: ");
		System.out.println(getBestStudent(students));

	}

}
