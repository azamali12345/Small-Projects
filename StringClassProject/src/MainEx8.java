
public class MainEx8 
{

	public static void main(String[] args) 
	{
		StringBuilder sb1=new StringBuilder();
		System.out.println(sb1);////Empty String
		System.out.println(sb1.length());//0
		System.out.println(sb1.capacity());//16
		
		StringBuilder sb2=new StringBuilder("Raghu");
		System.out.println(sb2);////Raghu
		System.out.println(sb2.length());//5
		System.out.println(sb2.capacity());//21(5+16)
		
		StringBuilder sb3=new StringBuilder(5);
		System.out.println(sb3);////Empty String
		System.out.println(sb3.length());//0
		System.out.println(sb3.capacity());//5

	}

}
