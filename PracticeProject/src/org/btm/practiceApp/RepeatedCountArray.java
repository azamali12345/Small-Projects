package org.btm.practiceApp;
public class RepeatedCountArray 
{
	public static void main(String args[])
	{
		int arr[]={1,3,1,2,3,5,4,6,8,7,8};
		System.out.println(arr.length);
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]&&(i!=j))
				{
					System.out.println("Duplicate Element Are..."+arr[j]);
				}
			}
		}
	}
}
