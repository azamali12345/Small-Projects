//Example Of TreeSet 
import java.util.*;
public class MainExp16 
{

	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		ts.add("F");
		ts.add("W");
		ts.add("R");
		ts.add("G");
		ts.add("D");
		ts.add("B");
		ts.add("Z");
		ts.add("X");
		ts.add("C");
		ts.add("A");
		ts.add("V");
		ts.add("G");
		//ts.add(123);
		//ts.add(null);
		System.out.println(ts);//[A, B, C, D, F, G, R, V, W, X, Z]
		
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("---------------");
		
		for(Object obj:ts)
		{
			System.out.println(obj);
		}
	}

}
