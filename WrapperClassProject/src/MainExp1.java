//Wrapper Class Example
public class MainExp1 
{

	public static void main(String[] args) 
	{
		System.out.println(Integer.MIN_VALUE);//-2147483648
		System.out.println(Integer.MAX_VALUE);//2147483647
		String a="456";
		String b="789";
		System.out.println(Integer.parseInt(a)+Integer.parseInt(b));//1245
		
		/*String p="ABC";
		int i=Integer.parseInt(p);
		System.out.println(i);*/
		
		Integer v1=new Integer("123");
		Integer v2=new Integer(123);//Primitive Object Type Boxing
		
		System.out.println(v1);//123
		System.out.println(v2);//123
		
		System.out.println(v1.hashCode());//123
		System.out.println(v2.hashCode());//123
		
		System.out.println(v1.equals(v2));//true
		
		int v3=v1.intValue();//Object to Premitive Type Unboxing
		System.out.println(v3);//123
		
		Integer in=123;//Autoboxing
		System.out.println(in.toString());//123
		System.out.println(in.hashCode());//123
		
		Integer iref=new Integer(789);
		int x=iref;//Auto Unboxing
		System.out.println(x);//789
		
		Object ob1=new Integer(456);//Before 1.5 Version
		Object ob2=234;//Autoboxing to Integer Type
		Object ob3='C';
		System.out.println(ob3 instanceof Character);//true
		Object ob4=45.67;
		System.out.println(ob4 instanceof Double);//true
		
		
		
		
	}

}

