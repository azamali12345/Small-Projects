
public class MainEx7 
{

	public static void main(String[] args) 
	{
		String s1="Raghu";
		System.out.println(s1.length());//5
		System.out.println(s1.charAt(0));//R
		System.out.println(s1.charAt(s1.length()-1));//u
		String s2=(String)s1.subSequence(1,4);
		System.out.println(s2);//agh

	}

}
