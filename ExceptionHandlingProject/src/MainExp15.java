import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainExp15 
{
	static void fileRead(String st)
	{
		System.out.println("fileRead Method Started..");
		try
		{
			FileInputStream fin=new FileInputStream(st);
			int i;
				try 
				{
						while((i=fin.read())!=-1)
							System.out.println((char)i);
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				System.out.println("File Is There And It Is Opened...");
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("fileRead Method End...");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method Started...");
		fileRead("uahyeuhfujhjhjhj");
		System.out.println("Main Method End...");

	}

}
