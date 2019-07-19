
public class Student15 
{
int id;
String name;
double per;
public Student15(int id, String name, double per) 
{
	this.id = id;
	this.name = name;
	this.per = per;
}


@Override
public String toString() 
{
	return "["+id+","+name+","+per+"]";
}


@Override
public int hashCode()
{
	return this.id;
}

@Override
public boolean equals(Object obj) 
{
	return this.hashCode()==obj.hashCode();
}


}
