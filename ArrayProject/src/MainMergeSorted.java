
public class MainMergeSorted 
{

	public static void main(String[] args) 
	{
		ArrayOperation ao=new ArrayOperation();
		System.out.println("Read the first array element...");
		int x[]=ao.readIntArr();
		System.out.println("Read the second array element...");
		int y[]=ao.readIntArr();
		
		int z[]=ao.mergeSorted(x, y);
		System.out.println("After Merge two sorted array in sorted format...");
		ao.displayIntArr(z);
		
	}

}
