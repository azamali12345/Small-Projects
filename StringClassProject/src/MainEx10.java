
public class MainEx10 
{

	public static void main(String[] args) 
	{
		StringBuilder sb1=new StringBuilder(5);
		System.out.println(sb1);//Empty String
		System.out.println(sb1.length());//0
		System.out.println(sb1.capacity());//5
		System.out.println(sb1.hashCode());//1829164700
		sb1.append("Raghu");
		System.out.println(sb1);//Raghu
		System.out.println(sb1.length());//5
		System.out.println(sb1.capacity());//5
		System.out.println(sb1.hashCode());//1829164700
		sb1.append("GBR");
		System.out.println(sb1);//RaghuGBR
		System.out.println(sb1.length());//8
		System.out.println(sb1.capacity());//12
		System.out.println(sb1.hashCode());//1829164700
		System.out.println("----------");
		StringBuilder sb2=new StringBuilder();
		System.out.println(sb2);//Empty String
		System.out.println(sb2.length());//0
		System.out.println(sb2.capacity());//16
		System.out.println(sb2.hashCode());//2018699554
		sb2.append("Jspider");
		System.out.println(sb2);//Jspider
		System.out.println(sb2.length());//7
		System.out.println(sb2.capacity());//16
		System.out.println(sb2.hashCode());//2018699554
		sb2.append(" And");
		System.out.println(sb2);//Jspider And
		System.out.println(sb2.length());//11
		System.out.println(sb2.capacity());//16
		System.out.println(sb2.hashCode());//2018699554
		sb2.append(" Qspider");
		System.out.println(sb2);//Jspider And Qspider
		System.out.println(sb2.length());//19
		System.out.println(sb2.capacity());//34(16*2+2)
		System.out.println(sb2.hashCode());//2018699554
		
		

	}

}
