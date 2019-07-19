import java.util.Comparator;
public class DuplicateCom implements Comparator 
{
	@Override
	public int compare(Object ob1, Object ob2) 
	{
		Integer i1=(Integer)ob1;
		Integer i2=(Integer)ob2;
		if(i1.compareTo(i2)<=0)
			return -1;
		else
			return 1;
	}

}
