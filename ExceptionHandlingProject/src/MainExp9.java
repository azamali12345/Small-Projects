import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class MainExp9 
{

	public static void main(String[] args) 
	{
		System.out.println("Main Method Started....");
		FileInputStream fin=null;
		try
		{
			//fin=FileInputStream("D:\\JSpider\\abc.txt");
			int i;
			while((i=fin.read())!=1)
				System.out.print((char)i);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Is Not There...");
		}
		catch(IOException e)
		{
			System.out.println("It Not Allow us read...");
		}
		finally
		{
			try
			{
				fin.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("\n File is Closed.");
		}
	
		
		System.out.println("Thank You...");
		System.out.println("Main Method Started....");
		

	}

	

}
