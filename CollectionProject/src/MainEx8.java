import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class MainEx8 
{

	public static void main(String[] args) 
	{
		ArrayList fruits=new ArrayList(5);
		fruits.add("APPLE");
		fruits.add("BANANA");
		fruits.add("ORANGE");
		fruits.add("MANGO");
		fruits.add("GRAPES");
		System.out.println(fruits);
		System.out.println("----------------");
		
		Iterator it=fruits.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("----------------");
		
		ListIterator lit=fruits.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		System.out.println("----------------");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		
	}

}
