package org.bridgelabz.practiceApp;
public class BinarySearchWord 
{
		// Returns index of x if it is present in arr[], 
	    // else return -1 
	    static int binarySearch(String arr[],String x) 
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
	  
	    // Driver method to test above 
	    public static void main(String args[]) 
	    { 
	        String arr[]={"Welcome","Azam","To","Bridge","Labz","In","Mumbai"}; 
	        String x="Bridge"; 
	        int result=binarySearch(arr,x); 
	        if (result==-1) 
	        {
	            System.out.println("Element not present"); 
	        }
	        else
	        {
	            System.out.println("Element found at "+"index "+result); 
	        }
	    } 
	
}


