//Our Own Implementation Allow Duplicate Value And Descending Order
import java.util.*;
public class MainDuplicateCom 
{

	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet(new DuplicateCom());
		ts.add(23);
		ts.add(19);
		ts.add(21);
		ts.add(19);
		ts.add(26);
		ts.add(24);
		ts.add(25);
		ts.add(29);
		System.out.println(ts);
		
		Comparator dsc=new Comparator()
									{
										public int compare(Object ob1,Object ob2)
										{
											Integer i1=(Integer)ob1;
											Integer i2=(Integer)ob2;
											if(i1<=i2)
												return 1;
											else
												return -1;
										}
									};
									
		TreeSet ts1=new TreeSet(dsc);
		ts1.add(ts);
		System.out.println(ts1);
	}

}
