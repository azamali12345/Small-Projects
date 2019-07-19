public class BSearch
{
   public static void main(String args[])
   {
       int size,search,first,last,mid;
       int arr[]={10,15,20,25,30,35,40}; 
       System.out.println("Enter a Number to Search...");
       search=25;
       size=arr.length;
       first=0;
       last=size-1;
       mid=(first+last)/2;
	   
       while(first<=last)
       {
           if(arr[mid]<search)
           {
               first=mid+1;
           }
           else if(arr[mid]==search)
           {
               System.out.print(search+" Found at Location "+mid);
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
           System.out.print(search+" is not Present in the List.");
       }
   }
}