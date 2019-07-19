package org.bridgelabz.practiceApp;
import java.util.Scanner;
public class InsertionSort 
{
    public static void insertionSort(int arr[])
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
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in );        
        int n,i;
        System.out.println("Enter number of integer elements");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+ n +" integer elements");
        
        for (i=0;i<n;i++)
            arr[i]=sc.nextInt();
        
        insertionSort(arr);
        
        System.out.println("Elements after sorting ");        
        
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");            
        System.out.println();                     
    }    
}