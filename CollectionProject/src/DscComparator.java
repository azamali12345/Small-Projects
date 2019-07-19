import java.util.Comparator;

public class DscComparator implements Comparator 
{

	@Override
	public int compare(Object ob1, Object ob2) 
	{
		String s1=(String)ob1;
		String s2=(String)ob2;
		return -s1.compareTo(s2);
	}

}
