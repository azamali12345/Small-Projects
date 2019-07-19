//Vector Example
import java.util.Vector;
public class MainExp10 
{

	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		System.out.println(v1.capacity());//10
		System.out.println(v1.size());//0
		System.out.println(v1);//[]
		System.out.println("---------------");//-----------
		
		Vector v2=new Vector(5);
		System.out.println(v2.capacity());//5
		System.out.println(v2.size());//0
		v2.add("A");
		v2.add("B");
		v2.addElement("C");//Same like add()
		v2.addElement("D");//Same like add()
		v2.addElement("E");//Same like add()
		System.out.println(v2);//[A, B, C, D, E]
		System.out.println(v2.capacity());//5
		System.out.println(v2.size());//5
		v2.add("F");
		System.out.println(v2.capacity());//10
		System.out.println(v2.size());//6
		System.out.println(v2);//[A, B, C, D, E, F]
		System.out.println("----------------");//---------
		
		Vector v3=new Vector(3,5);
		System.out.println(v3.capacity());//3
		System.out.println(v3.size());//0
		v3.add("RAAJ");
		v3.add("TAAJ");
		v3.add("BAAJ");
		v3.add("JSP");
		System.out.println(v3.capacity());////8
		System.out.println(v3.size());//4
		System.out.println(v3);//[RAAJ, TAAJ, BAAJ, JSP]
		System.out.println("-----------");//-----------
		
		Vector v4=new Vector(v2);
		System.out.println(v4.capacity());//6
		System.out.println(v4.size());//6
		v4.add("QSP");
		System.out.println(v4.capacity());//12
		System.out.println(v4);//[A, B, C, D, E, F, QSP]

	}

}
