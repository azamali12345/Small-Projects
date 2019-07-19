
public class MainEx3 
{

	public static void main(String[] args) 
	{
		Object ob1=new Object();
		System.out.println(ob1.toString());//java.lang.Object@6d06d69c//Fully Qualified Name
		Object ob2=new Object();
		String s1=ob2.toString();
		System.out.println(s1);//java.lang.Object@7852e922//Fully Qualified Name
		System.out.println(ob1);//java.lang.Object@6d06d69c//Fully Qualified Name
		System.out.println(ob2);//java.lang.Object@7852e922//Fully Qualified Name
		System.out.println("---------");
		MainEx3 mx1=new MainEx3();
		System.out.println(mx1.toString());//MainEx3@4e25154f
		System.out.println(mx1);//MainEx3@4e25154f
		System.out.println("---------");
		Object ob3=new Object()
							{
								public String toString()
								{
									return "JAVA";
								}
							};
		System.out.println(ob3);//JAVA
		System.out.println(ob3.toString());//JAVA
		System.out.println("---------");
		Sample1 sp1=new Sample1();
		System.out.println(sp1);//Sample1@70dea4e
		System.out.println(sp1.toString());//Sample1@70dea4e
		System.out.println("------------");
		Pen1 p1=new Pen1("Red",40);
		Pen1 p2=new Pen1("Black",50);
		System.out.println(p1);//Red Color Pen
		System.out.println(p2);//Black Color Pen
		System.out.println("-------");
		Student1 std1=new Student1(123,"Rajesh",78.98);
		Student1 std2=new Student1(456,"Suresh",87.56);
		System.out.println(std1);//[123,Rajesh,78.98]
		System.out.println(std2);//[456,Suresh,87.56]
		System.out.println(std1.toString());//[123,Rajesh,78.98]
		System.out.println(std2.toString());//[456,Suresh,87.56]
		
				
	}

}
