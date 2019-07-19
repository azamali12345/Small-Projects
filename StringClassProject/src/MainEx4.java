
public class MainEx4 
{

	public static void main(String[] args) 
	{
		String s1="Jspider";
		String s2=new String("Jspider");
		char ch[]= {'J','s','p','i','d','e','r'};
		String s3=new String(ch);
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//false
		System.out.println(s1.hashCode());//354809775
		System.out.println(s2.hashCode());//354809775
		System.out.println(s3.hashCode());//354809775
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true

	}

}
