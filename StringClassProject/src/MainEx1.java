
public class MainEx1 
{

	public static void main(String[] args) 
	{
		String s1=new String();
		System.out.println(s1);//Empty String
		System.out.println(s1.hashCode());//0
		System.out.println(s1.length());//0
		
		String s2=new String("JAVA");
		System.out.println(s2);//JAVA
		System.out.println(s2.hashCode());//2269730
		System.out.println(s2.length());//4
		
		String s3=new String("Raghu");
		System.out.println(s3);//Raghu
		System.out.println(s3.hashCode());//78720773
		System.out.println(s3.length());//5
		
		String s4=new String("JAVA");
		System.out.println(s4);//JAVA
		System.out.println(s4.hashCode());//2269730
		System.out.println(s4.length());//4
		
		System.out.println(s2.equals(s3));//false
		System.out.println(s2.equals(s4));//true
		
		System.out.println(s2==s3);//false
		System.out.println(s2==s4);//false



	}

}
