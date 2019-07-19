
public class Customer 
{
int id;
String name;
long mob;
public Customer(int id, String name, long mob) {
	super();
	this.id = id;
	this.name = name;
	this.mob = mob;
}
public String toString()
{
	return "["+id+","+name+","+mob+"]";
}
}
