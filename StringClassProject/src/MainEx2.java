
public class MainEx2 
{
	public static void main(String args[])
	{
		String s1="Raghu";
		String s2="Java";
		String s3="Raghu";
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equals(s3));//true
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//true
		
		String st1=new String("Raghu");
		String st2=new String("Raghu");
		System.out.println(st1.equals(st2));//true
		System.out.println(st1==st2);//false
	}
}
