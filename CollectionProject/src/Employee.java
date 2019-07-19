
public class Employee 
{
int id;
String name;
double sal;
public Employee(int id, String name, double sal)
{
	super();
	this.id = id;
	this.name = name;
	this.sal = sal;
}
public String toString()
{
	return "["+id+","+name+","+sal+"]";
}
}
