import java.util.TreeSet;

public class MainExp19
{

	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		ts.add(new Customer19(121,"RAJESH",9999999999l));
		ts.add(new Customer19(122,"Rakesh",8888888888l));
		ts.add(new Customer19(123,"Rajesh",6666666666l));
		ts.add(new Customer19(124,"Ravish",7777777777l));
		System.out.println(ts);
		for(Object obj:ts)
		{
			System.out.println(obj);
		}
	}

	

}
