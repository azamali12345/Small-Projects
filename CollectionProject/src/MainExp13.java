import java.util.*;
public class MainExp13 
{

	public static void main(String[] args) 
	{
		
		HashSet hs=new HashSet();
		hs.add("RAGHU");
		hs.add("RAJU");
		hs.add("RAMU");
		hs.add("RAHUL");
		hs.add("RAMYA");
		System.out.println(hs);//[RAMU, RAHUL, RAMYA, RAGHU, RAJU]
		System.out.println(hs.size());//5
		
		HashSet hs1=new HashSet(5);
		hs.add(23);
		hs.add(24);
		hs.add(25);
		hs.add(23);
		hs.add(21);
		System.out.println(hs1);//[]
		System.out.println(hs1.size());//0
		
		HashSet hs2=new HashSet(8,0.50f);
		hs2.add(new Employee13(123,"AKASH",70000));
		hs2.add(new Employee13(124,"ASIF",80000));
		hs2.add(new Employee13(123,"ARPIT",50000));
		hs2.add(new Employee13(123,"ASIF",75000));
		hs2.add(new Employee13(126,"AKASH",50000));
		System.out.println(hs2);//[EMPLOYEE [ID= 123, NAME= ARPIT SALARY= 50000.0], EMPLOYEE [ID= 123, NAME= AKASH SALARY= 70000.0], EMPLOYEE [ID= 123, NAME= ASIF SALARY= 75000.0], EMPLOYEE [ID= 124, NAME= ASIF SALARY= 80000.0]]
		System.out.println(hs2.size());//4
	}

}
