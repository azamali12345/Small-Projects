//PROGRAM TO SORT ELEMENT USING INSERTION SORT
package org.bridgelabz.algorithmProgram;
import java.util.Scanner;
public class InsertionSort 
{
	//FUNCTION FOR INSERTION SORT FOR INTEGER
	public static void insertionSortInteger(int arr[])
    {
        int len=arr.length;
        int i,j,temp;
        for(i=1;i<len;i++) 
        {
            j=i;
            temp=arr[i];    
            while(j>0&&temp<arr[j-1])
            {
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=temp;            
        }        
    }
	public static void main(String args[])
	{
		//THIS IS INSERSION SORT FOR INTEGER
		int arr3[]={25,65,35,5,15};
		int n=arr3.length;
		System.out.println("*****INSERTION SORT FOR INTEGER*****");
		System.out.println("-----BEFORE INSERTION SORT-----"); 
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		System.out.println("-----AFTER INSERTION SORT-----"); 
		insertionSortInteger(arr3);
		for(int i=0;i<n;i++)
		{
    	System.out.print(arr3[i]+" ");
		}
	}
}
