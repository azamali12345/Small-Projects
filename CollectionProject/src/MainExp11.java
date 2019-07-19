//Vector Example
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class MainExp11 
{

	public static void main(String[] args) 
	{
		Vector v1=new Vector(5);
		System.out.println(v1.capacity());//5
		System.out.println(v1.size());//0
		v1.add("A");
		v1.add("B");
		v1.add("C");
		v1.add("D");
		v1.add("E");
		
		//USING FOR LOOP
		for(int i=0;i<v1.size();i++)
		{
			System.out.println(v1.elementAt(i));
		}
		
		//USING ENUMURATION
		Enumeration en=v1.elements();
		while(en.hasMoreElements())
		{
			Object obj=en.nextElement();
			System.out.println(obj);
		}
		
		//USING ITERATOR
		Iterator it=v1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//USING LISTITERATOR
		ListIterator lit=v1.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		//PREVIOUS
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		
				
	}

}
