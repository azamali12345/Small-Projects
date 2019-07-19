import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainExp13 
{
		static void fileRead(String st)throws FileNotFoundException
		{
			FileInputStream fin=new FileInputStream(st);
			System.out.println("fileRead Methid End....");
		}
		public static void main(String[] args) 
		{
			System.out.println("Main Method Started...");
			try 
			{
				fileRead("D:dhjshukhj");
			}
			catch(FileNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("Main Method End...");

	}

}
