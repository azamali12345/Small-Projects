
public class MainEx5 
{

	public static void main(String[] args) 
	{
		String s1="Jspider";
		System.out.println(s1);//Jspider
		s1.toLowerCase();
		System.out.println(s1);//Jspider
		String s2=s1.toLowerCase();
		System.out.println(s1);//Jspider
		System.out.println(s2);//jspider
		String s3="Raghu";
		s3.toUpperCase();
		System.out.println(s3);//Raghu
		s3=s3.toUpperCase();
		System.out.println(s3);//RAGHU
		String s4="JAVA";
		s4.concat("is easy");
		System.out.println(s4);//JAVA
		String s5=s4.concat(" IS EASY");
		System.out.println(s5);//JAVA IS EASY
		
		

	}

}
