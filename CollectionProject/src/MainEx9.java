import java.util.*;
public class MainEx9 
{

	public static void main(String[] args) 
	{
		LinkedList ls=new LinkedList();
		ls.add("RAJ");
		ls.add("TAJ");
		ls.add("SAJ");
		ls.add("GAJ");
		ls.add("AAJ");
		ls.add("TAJ");
		ls.add("MAJ");
		ls.add(2,"NAAZ");
		ls.add("BAJ");
		ls.add("FAZ");
		System.out.println(ls);//[RAJ, TAJ, NAAZ, SAJ, GAJ, AAJ, ZAJ, MAJ, BAJ, FAZ]
		System.out.println(ls.size());//10
		System.out.println(ls.getFirst());//RAJ
		System.out.println(ls.getLast());//FAZ
		System.out.println(ls.offerFirst("PYAAZ"));
		System.out.println(ls.offerLast("NYAAZ"));
		System.out.println(ls);//[PYAAZ, RAJ, TAJ, NAAZ, SAJ, GAJ, AAJ, ZAJ, MAJ, BAJ, FAZ, NYAAZ]
		System.out.println(ls.indexOf("TAJ"));//2
		System.out.println(ls.lastIndexOf("TAJ"));//7
		
		ListIterator lit=ls.listIterator();
		int count=0;
		while(lit.hasNext())
		{
			System.out.println(lit.next());
			count++;
			if(count==5)
				break;
		}
		System.out.println("***********");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		
	}

}
