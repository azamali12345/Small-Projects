import java.util.Comparator;
public class PriorityQueueComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) 
	{
		Character c1=(Character)o1;
		Character c2=(Character)o2;
		return -c1.compareTo(c2);
	}

}
