
public class Student1 
{
	int id;
	String name;
	double per;
	Student1(int id,String name,double per)
	{
		this.id=id;
		this.name=name;
		this.per=per;
	}
	public String toString()
	{
		return "["+id+","+name+","+per+"]";
	}
}
