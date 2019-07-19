
public class MainEx11 
{

	public static void main(String[] args) 
	{
		StringBuilder sb1=new StringBuilder("Raghu");
		String s1=new String("Raghu");
		System.out.println(sb1);//Raghu
		System.out.println(s1);//Raghu
		System.out.println(sb1.hashCode());//1829164700
		System.out.println(s1.hashCode());//78720773
		sb1.append("GB");
		s1.concat("GB");
		System.out.println(sb1);//RaghuGB
		System.out.println(s1);//Raghu
		sb1.reverse();
		System.out.println(sb1);//BGuhgaR
		s1=s1.concat("GBR");
		System.out.println(s1);//RaghuGBR
	}

}
