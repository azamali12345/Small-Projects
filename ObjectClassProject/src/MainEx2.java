
public class MainEx2 
{

	public static void main(String[] args) 
	{
		Object ob1=new Object()
							{	
								public int hasgCode()
								{
									return 820;
								}
							};
		Object ob2=new Object();
		Object ob3=new Object()
								{	
									public int hasgCode()
									{
										return 920;
									}
								};
		System.out.println(ob1.hashCode());//1829164700
		System.out.println(ob2.hashCode());//2018699554
		System.out.println(ob3.hashCode());//1311053135
		
	}

}
