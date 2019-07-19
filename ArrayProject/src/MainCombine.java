public class MainCombine {

	public static void main(String[] args) 
	{
	ArrayOperation ao=new ArrayOperation();
	System.out.println("Enter First Array Element ");
	int x[]=ao.readIntArr();
	System.out.println("Enter Second Array Element ");
	int y[]=ao.readIntArr();
	System.out.println("Display First Array Element Are.....");
	ao.displayIntArr(x);
	System.out.println("Display Second Array Element Are....");
	ao.displayIntArr(y);
	int z[]=ao.combine(x,y);
	System.out.println("Cmbine Array Element Are......");
	ao.displayIntArr(z);
	

	}

}
