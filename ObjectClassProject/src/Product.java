
public class Product 
{
	int pid;
	String pname;
	double pprice;
	public Product(int pid,String pname,double pprice)
	{
		this.pid=pid;
		this.pname=pname;
		this.pprice=pprice;
		
	}
	public String toString()
	{
		return "["+pid+","+pname+","+pprice+"]";
	}
	public int hashCode()
	{
		return pid;
	}
	public boolean equals(Object obj)
	{
		Product p=(Product)obj;//DOWNCASTING
		return this.pprice==pprice;
	}
	
}
