public class Student 
{
int id;
String name;
double per;
public Student(int id, String name, double per) 
{
	super();
	this.id = id;
	this.name = name;
	this.per = per;
}
public String toString()
{
	return "["+id+","+name+","+per+"]";
}
}
