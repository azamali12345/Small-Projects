
public class MainEx6
{

	public static void main(String[] args)
	{
		Product p1=new Product(123,"MOBILE",14999.99);
		Product p2=new Product(124,"Watch",11999.49);
		Product p3=new Product(125,"LED",14999.99);
		System.out.println(p1);//[123,MOBILE,14999.99]
		System.out.println(p1.hashCode());//123
		System.out.println(p2);//[124,Watch,11999.49]
		System.out.println(p2.hashCode());//124
		System.out.println(p3);//[123,MOBILE,14999.99]
		System.out.println(p3.hashCode());//125
		System.out.println(p1.equals(p2));//true
		System.out.println(p1.equals(p3));//true
		System.out.println(p1==p2);//false
		System.out.println(p1==p3);//false
	}

}
