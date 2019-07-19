public class Rose 
{
	void propose(String color)throws Exception
	{
		if(color.equalsIgnoreCase("red"))
			throw new LoveStoryException("SUCCSESS");
		else
			throw new LoveStoryException("FAILURE"); 
			
			
	}
}
