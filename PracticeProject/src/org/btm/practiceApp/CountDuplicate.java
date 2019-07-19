package org.btm.practiceApp;
public class CountDuplicate 
{
	int arr[]={1,2,3,4,1,2,3};
	int temp,count;
	public void find()
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
					count++;
			}
		}
	}
	
	public static void main(String[] args)
	{
		CountDuplicate cd=new CountDuplicate();
		cd.find();
		System.out.println("The No Of Duplicates Is..."+cd.count);
	}
	
}
