
public class MainEx4 
{

	public static void main(String[] args)
	{
		Object ob1=new Object();
		Object ob2=new Object();
		boolean rs1=ob1.equals(ob2);
		boolean rs2=ob1.equals(ob1);
		boolean rs3=ob2.equals(ob1);
		boolean rs4=ob2.equals(ob2);
		System.out.println(rs1);//false
		System.out.println(rs2);//true
		System.out.println(rs3);//false
		System.out.println(rs4);//true
		
		MainEx4 mx1=new MainEx4();
		MainEx4 mx2=new MainEx4();
		MainEx4 mx3=mx1;
		System.out.println(mx1.equals(mx2));//false
		System.out.println(mx1.equals(mx3));//true
		System.out.println(mx2.equals(mx3));//false
		System.out.println(mx3.equals(mx1));//true
	}

}
