public class Student18 implements Comparable
{
int id;
String name;
double per;
public Student18(int id, String name, double per) 
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
public int compareTo(Object ob)
{
	Student18 std=(Student18)ob;
	if(this.per>std.per)
		return -1;
	else if(this.per<std.per)
		return 1;
	else
		return 0;
}

}
