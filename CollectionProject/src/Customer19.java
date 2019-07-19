public class Customer19 implements Comparable
{
int id;
String name;
long mob;
public Customer19(int id, String name, long mob) 
{
	this.id = id;
	this.name = name;
	this.mob = mob;
}


@Override
public String toString() 
{
	return "["+id+","+name+","+mob+"]";
}

@Override
public int compareTo(Object ob)
{
	Customer19 cs=(Customer19)ob;
	if(this.mob>cs.mob)
		return 1;
	else if(this.mob<cs.mob)
		return +1;
	else
		return 0;
}

}
