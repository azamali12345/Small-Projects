package org.bridgelabz.algorithmProgram;
import java.util.Scanner;
public class SearchingSorting 
{
	//FUNCTION FOR BINARY SEARCH FOR INTEGER
	public static void binarySearchInteger(int arr[],int first,int last,int key)
	{  
		int mid=(first+last)/2;  
		while(first<=last)
		{  
			if(arr[mid]<key)
			{  
				first=mid+1;     
		    }
			else if(arr[mid]==key)
			{  
		        System.out.println("ELEMENT IS FOUND AT INDEX..."+mid);  
		        break;  
		    }
			else
			{  
		        last=mid-1;  
		    }  
		    mid=(first+last)/2;  
		}  
		if(first>last)
		{  
			System.out.println("ELEMENT IS NOT FOUND!!!");  
		}  
	}  
	//FUNCTION FOR BINARY SEARCH FOR STRING
	static int binarySearchString(String arr[],String x) 
    { 
        int left=0,right=arr.length-1; 
        while(left<=right) 
        { 
            int mid=left+(right-left)/2; 
            int res=x.compareTo(arr[mid]); 
            //Check if x is present at mid 
            if(res==0) 
                return mid; 
            // If x greater, ignore left half 
            if(res>0) 
                left=mid+1; 
            // If x is smaller, ignore right half 
            else
                right=mid-1; 
        } 
        return -1; 
    } 
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
	//FUNCTION FOR INSERTION SORT FOR STRING
	public static String[] insertionSortString(String arr[],int f)
	{
		String temp="";
		for(int i=0;i<f;i++)
		{
			for(int j=i+1;j<f;j++)
			{
				if(arr[i].compareToIgnoreCase(arr[j])>0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	//FUNCTION FOR BUBBLE SORT FOR INTEGER
	static void bubbleSortInteger(int arr[]) 
	{  
        int n=arr.length;  
        int temp = 0;  
        for(int i=0;i<n;i++)
        {  
        	for(int j=1;j<(n-i);j++)
        	{  
        		if(arr[j-1]>arr[j])
        		{  
        			//SWAP ELEMENTS  
                    temp=arr[j-1];  
                    arr[j-1]=arr[j];  
                    arr[j]=temp;  
                }  
             }  
         }
	}
	//FUNCTION FOR BUBBLE SORT FOR STRING
	static void bubbleSortString(String arr[]) 
    {
    	String temp;
    	for(int i=0;i<arr.length;i++) 
    	{
    		for(int j=0;j<arr.length-1-i;j++) 
    		{
    			if(arr[j].compareTo(arr[j+1])>0) 
    			{
    				//SWAPPING
    				temp=arr[j];
    				arr[j]=arr[j+1];
    		        arr[j+1]=temp;
    		    }
    		 }
    	}
    } 
	//MAIN METHOD
	public static void main(String args[])
	{  
		//THIS IS FOR INTEGER BINARY SEARCH
		int arr[]={10,20,30,40,50};
		System.out.println("*****BINARY SEARCHING FOR INTEGER*****");
		for(int i=0;i<arr.length;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
		System.out.println();
		int key=30;  
		int last=arr.length-1;
		System.out.println("I WANT TO SEARCH 30 ELEMENT...WHAT IS POSTION OF 30...");
		binarySearchInteger(arr,0,last,key);
		System.out.println();
	    System.out.println();
		
		//THIS IS FOR STRING BINARY SEARCH
	    String arr2[]={"Welcome","Azam","To","Bridge","Labz","In","Mumbai"}; 
	    System.out.println("*****BINARY SEARCH FOR STRING*****");
	    for(int i=0;i<arr2.length;i++)
	    {
	    	System.out.print(arr2[i]+" ");
	    }
	    System.out.println();
	    String x="Bridge";
	    System.out.println("I WANT TO SEARCH 'BRIDGE' ELEMENT...WHAT IS POSTION OF 'BRIDGE'...");
	    int result=binarySearchString(arr2,x); 
	    if (result==-1) 
	    {
	    	System.out.println("ELEMENT NOT PRESENT..."); 
	    }
	    else
	    {
	    	System.out.println("ELEMENT FOUND AT INDEX..."+result); 
	    }
	    System.out.println();
	    System.out.println();
	    
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
	    System.out.println();
	    System.out.println();
	    
	    //THIS IS INSERTION SORT FOR STRING
	    String arr4[]={"Welcome","Azam","To","Bridge","Labz","In","Mumbai"};
	    System.out.println();
	    System.out.println("*****INSERTION SORT FOR STRING*****");
        System.out.println("-----BEFORE INSERTION SORT-----"); 
        for(int i=0;i<arr4.length;i++)
	    {
	    	System.out.print(arr4[i]+" ");
	    }
        System.out.println();
        System.out.println("-----AFTER INSERTION SORT-----"); 
	    String sortedArray[]=insertionSortString(arr4,arr4.length);
	    
	    for(int i=0;i<sortedArray.length;i++)
	    {
	    	System.out.print(sortedArray[i]+" ");
	    }
	    System.out.println();
	    System.out.println();
	    
	    //THIS IS BUBBLE SORT FOR INTEGER
	    int arr5[]={66,55,22,99,77,33,11};
	    System.out.println();
	    System.out.println("*****BUBBLE SORT FOR INTEGER*****");
        System.out.println("-----BEFORE BUBBLE SORT-----");  
        for(int i=0;i<arr5.length;i++)
        {  
        	System.out.print(arr5[i]+" ");  
        }  
        System.out.println();
        bubbleSortInteger(arr5);  
        System.out.println("-----AFTER BUBBLE SORT-----");  
        for(int i=0;i<arr5.length;i++)
        {  
        	System.out.print(arr5[i]+" ");  
        }
        System.out.println();
        System.out.println();
        
        //THIS IS BUBBLE SORT FOR STRING
        String arr6[]={"Welcome","Azam","To","Bridge","Labz","In","Mumbai"};
        System.out.println();
        System.out.println("*****BUBBLE SORT FOR STRING*****");
        System.out.println("-----BEFORE BUBBLE SORT-----");
        for(int i=0;i<arr6.length;i++)
        {  
        	System.out.print(arr6[i]+" ");  
        }
        System.out.println();
        bubbleSortString(arr6);
        System.out.println("-----AFTER BUBBLE SORT-----"); 
        for(int i=0;i<arr6.length;i++)
        {
        	System.out.print(arr6[i]+" ");
        }
        	        
	}  
}
