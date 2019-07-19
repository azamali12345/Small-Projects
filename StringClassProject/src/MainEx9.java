
public class MainEx9 
{

	public static void main(String[] args) 
	{
		StringBuilder sb1=new StringBuilder("Raghu");
		StringBuilder sb2=new StringBuilder("Raghu");
		StringBuilder sb3=new StringBuilder("Rajesh");
		System.out.println(sb1.hashCode());//1829164700
		System.out.println(sb2.hashCode());//2018699554
		System.out.println(sb3.hashCode());//1311053135
		System.out.println(sb1.equals(sb2));//false
		sb1.append("GB");
		System.out.println(sb1);//RaghuGB
		System.out.println(sb1.hashCode());//1829164700
		sb1.replace(3,5,"vendra");
		System.out.println(sb1);//RagvendraGB
		System.out.println(sb1.hashCode());//1829164700
		
	}

}
