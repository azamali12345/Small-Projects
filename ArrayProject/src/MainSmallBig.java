public class MainSmallBig {

	public static void main(String[] args)
	{
		ArrayOperation ao=new ArrayOperation();
		int ele[]=ao.readIntArr();
		System.out.println("Array Elements");
		ao.displayIntArr(ele);
		int small=ao.getSmallest(ele);
		int big=ao.getBiggest(ele);
		System.out.println("Smallest Value is : "+small);
		System.out.println("Biggest Value is : "+big);

	}

}
