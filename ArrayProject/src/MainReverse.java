public class MainReverse 
{

	public static void main(String[] args) 
	{
		ArrayOperation ao=new ArrayOperation();
		System.out.println("Read the array elements...");
		int x[]=ao.readIntArr();
		System.out.println("Before reverse......");
		ao.displayIntArr(x);
		System.out.println("After reverse...");
		ao.reverseArray(x);
		ao.displayIntArr(x);
	}

}
