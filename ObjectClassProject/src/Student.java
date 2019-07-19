
public class Student 
{
	int id;
	String name;
	double per;
	public Student(int id,String name,double per)
	{
		this.id=id;
		this.name=name;
		this.per=per;
	}
	public boolean equals(Object ob)
	{
		if(ob instanceof Student)
		{
			Student s1=(Student)ob;
			return this.per==s1.per;
		}
		return false;
	}
}
