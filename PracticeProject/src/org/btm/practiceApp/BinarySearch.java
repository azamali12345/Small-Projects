package org.btm.practiceApp;
public class BinarySearch 
{
	public static void main(String args[])
	{
		int arr[]= {10,15,20,25,30,35,40,45,50,55,60};
		int first,last,mid;
		int search=25;
		int size=arr.length;
		System.out.println(size);
		first=0;
		last=size-1;
		mid=(first+last)/2;
		while(first<=last)
		{
			if(arr[mid]<search)
				first=mid+1;
			
			else if(arr[mid]==search)
			{
				System.out.println(mid);
				break;
			}
			
			else
				last=mid-1;
			
		mid=(first+last)/2;
		}
		
		if(first>last)
			{
			System.out.println("Not Present");
			}
			
	}
}
		

