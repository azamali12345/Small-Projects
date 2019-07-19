
public class MainEx5 
{

	public static void main(String[] args) 
	{
		Student std1=new Student(111,"RAKESH",78.98);
		Student std2=new Student(112,"RAJESH",54.56);
		Student std3=new Student(113,"LOKESH",78.98);
		System.out.println(std1.equals(std2));//false
		System.out.println(std2.equals(std1));//false
		System.out.println(std3.equals(std1));//true
		System.out.println(std1==std2);//false
		System.out.println(std1==std3);//false
	}

}
