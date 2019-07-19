
public class MainEx1 
{
	public int hashCode()
	{
		return 420;
	}
	public static void main(String[] args) 
	{
		Object ob1=new Object();
		int hcode=ob1.hashCode();
		System.out.println(ob1.hashCode());//1829164700
		Object ob2=new Object();
		System.out.println(ob2.hashCode());//2018699554
		Object ob3=ob2;
		System.out.println(ob3.hashCode());//2018699554
		System.out.println("***********");//***********
		
		Sample s1=new Sample();
		System.out.println(s1.hashCode());//1311053135
		Sample s2=new Sample();
		System.out.println(s2.hashCode());//118352462
		
		MainEx1 mx1=new MainEx1();
		System.out.println(mx1.hashCode());//420
		MainEx1 mx2=new MainEx1();
		System.out.println(mx2.hashCode());//420
		System.out.println("**********");//**********
		
		Pen p1=new Pen("Red",65);
		Pen p2=new Pen("Black",75);
		System.out.println(p1.hashCode());//65
		System.out.println(p2.hashCode());//75
		
	}

}
