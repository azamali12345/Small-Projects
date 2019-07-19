public class Employee17 implements Comparable
{
int id;
String name;
double sal;
public Employee17(int id, String name, double sal) 
{
	this.id = id;
	this.name = name;
	this.sal = sal;
}

@Override
public String toString() 
{
	return "["+id+","+name+","+sal+"]";
}

@Override
public int compareTo(Object ob)
{
	Employee17 emp=(Employee17)ob;
	if(this.sal>emp.sal)
		return 1;
	else if(this.sal<emp.sal)
		return -1;
	else
		return 0;
}

}
