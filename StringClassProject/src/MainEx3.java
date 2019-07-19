
public class MainEx3 
{

	public static void main(String[] args) 
	{
		String s1="JAVA";
		String s2="Raghu";
		String s3="JAVA";
		
		String st1=new String("JAVA");
		String st2=new String("Raghu");
		String st3=new String("JAVA");
		
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//true
		
		System.out.println(st1==st2);//false
		System.out.println(st1==st3);//false
		
		System.out.println(s1.equals(s3));//true
		System.out.println(st1.equals(st3));//true
		System.out.println(s1.equals(st1));//true
		System.out.println(s1==st1);//false
		
		
	}

}
