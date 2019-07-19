import java.util.ArrayList;

public class MainExp1 
{

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("Raghu");
		al.add(23.45);
		al.add(null);
		al.add(23);
		al.add(23.45);
		al.add(null);
		System.out.println(al);//[Raghu, 23.45, null, 23, 23.45, null]
		System.out.println(al.size());//6
		System.out.println(al.isEmpty());//false
		System.out.println(al.remove(23.45));//true
		System.out.println(al.remove("Suresh"));//false
		System.out.println(al);//[Raghu, null, 23, 23.45, null]
		System.out.println(al.contains(23));//true
		al.clear();
		System.out.println(al.size());//0
		System.out.println(al);//[]

	}

}
