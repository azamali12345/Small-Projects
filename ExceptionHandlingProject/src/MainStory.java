//Custom Exception Or User Define Exception
public class MainStory 
{

	public static void main(String[] args) 
	{
		Rose r=new Rose();
		try
		{
			r.propose("RED");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
