import java.util.*;

public class MainEmp17 
{

	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		ts.add(new Employee17(123,"Ramesh",35000));
		ts.add(new Employee17(124,"Rakesh",45000));
		ts.add(new Employee17(121,"Rajesh",25000));
		ts.add(new Employee17(122,"Ravish",40000));
		System.out.println(ts);
		for(Object obj:ts)
		{
			System.out.println(obj);
		}
	}

	

}
