import java.util.ArrayList;

public class MainExp3 
{

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList(10);
		al.add("Suresh");
		al.add("Rajesh");
		al.add("Ramesh");
		al.add("Suresh");
		al.add("Girish");
		System.out.println(al);//[Suresh, Rajesh, Ramesh, Suresh, Girish]
		ArrayList al1=al;
		System.out.println(al1==al);//true
		ArrayList a1=new ArrayList(7);
		a1.addAll(al);
		System.out.println(a1);//[Suresh, Rajesh, Ramesh, Suresh, Girish]
		System.out.println(al==a1);//false
		ArrayList a2=new ArrayList(al);
		System.out.println(al.size());//5
		System.out.println(a2==al);//false
	}

}
