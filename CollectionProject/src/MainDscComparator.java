//Program Name Wise Descending Order
import java.util.TreeSet;
public class MainDscComparator 
{

	public static void main(String[] args) 
	{
	TreeSet ts=new TreeSet(new DscComparator());
	ts.add("C");
	ts.add("E");
	ts.add("D");
	ts.add("A");
	ts.add("F");
	System.out.println(ts);
	}

}
