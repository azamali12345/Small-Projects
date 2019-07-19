import java.util.TreeSet;

public class MainExp18 
{

	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		ts.add(new Student18(123,"Ramesh",80.12));
		ts.add(new Student18(124,"Rakesh",82.45));
		ts.add(new Student18(121,"Rajesh",70.25));
		ts.add(new Student18(122,"Ravish",71.65));
		System.out.println(ts);
		for(Object obj:ts)
		{
			System.out.println(obj);
		}
	}

	

}
