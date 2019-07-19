import java.util.*;
import java.util.Comparator;
public class BasedOnPer implements Comparator 
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		Student20 s1=(Student20)o1;
		Student20 s2=(Student20)o2;
		if(s1.per>s2.per)
			return -1;
		else
			return 1;
		
	}

}
