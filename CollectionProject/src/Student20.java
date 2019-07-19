
public class Student20  implements Comparable
{
String name;
int id;
double per;
public Student20(String name, int id, double per) 
{
	super();
	this.name = name;
	this.id = id;
	this.per = per;
}

@Override
public String toString() 
{
	return "["+name+","+id+","+per+"]";
}

@Override
public int compareTo(Object o) 
{
	Student20 s=(Student20)o;
	return this.id-s.id;
}



}
