import java.util.Scanner;

public class ArrayOperation 
{
	
	int[] readIntArr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the how many integer value you have");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Ente "+size+" Values");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	void displayIntArr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			if(i!=arr.length-1)
				System.out.print(",");
		}
		System.out.println();
	}
	
	int getSmallest(int arr[])
	{
		int s=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(s>arr[i])
				s=arr[i];
		}
		return s;
	}
	int getBiggest(int arr[])
	{
		int b=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(b<arr[i])
				b=arr[i];
		}
		return b;
	}
	
	int[] combine(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		return c;
	}
	
	
	public int getBiggestAvg(int[]ar)
	{
		int big=ar[0];
		for(int i=1;i<ar.length;i++){
		if(ar[i]>big)
		big=ar[i];
		}
		return big;
	}
	
	double sumOfArray(int a[])
	{
	double sum=0.0;
	for(int i=0;i<a.length;i++){
	sum=sum+a[i];
	}
	return sum;
	}
	
	int[] zigZag(int x[],int y[])
	{
		int z[]=new int[x.length+y.length];
		int i=0,j=0,k=0;
		while(i<x.length&&j>y.length)
		{
			z[k++]=x[i++];
			z[k++]=y[j++];
		}
		while(i<x.length)
		{
			z[k++]=x[i++];
		}
		while(j<y.length)
		{
			z[k++]=y[j++];
		}
		return z;
	}
	
	public int[] mergeSorted(int x[],int y[])
	{
		int z[]=new int[x.length+y.length];
		int i=0,j=0,k=0;
		while(i<x.length&&j<y.length)
		{
			if(x[i]<y[j])
				z[k++]=x[i++];
			else
				z[k++]=y[j++];
		}
		while(i<x.length)
			z[k++]=x[i++];
		while(j<y.length)
			z[k++]=y[j++];
		return z;
	}
	
	public void reverseArray(int x[])
	{
		for(int i=0;i<x.length/2;i++)
		{
			int t=x[i];
			x[i]=x[x.length-1-i];
			x[x.length-1-i]=t;
		}
	}
	
	int[] insertAtPosition(int x[],int ele,int in)
	{
		if(in<0||in>x.length)
		{
			System.out.println("Index Not In the range...");
			return x;
		}
		int[] na=new int[x.length+1];
		for(int i=0;i<x.length;i++)
		{
			if(i<in)
				na[i]=x[i];
			else
				na[i+1]=x[i];
			
		}
		na[in]=ele;
		return na;
	}
	
	
}
