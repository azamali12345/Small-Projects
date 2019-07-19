package org.bridgelabz.algorithmProgram;
import java.util.ArrayList;
public class PrimeNoAnagram 
{
	public static boolean isAnagram(String first,String second)
	{
		//IF LENGTH OF BOTH WORDS ARE NOT SAME THEN STRING ARE NOT ANAGRAM
		int count1[]=new int[10];
		int count2[]=new int[10];
		if(first.length()!=second.length())
			return false;
		for(int i=0;i<first.length();i++) 
		{
			char ch=first.charAt(i);
			if(ch>='0'&&ch<'9')
				count1[ch-48]++;
		}
		for(int i=0;i<second.length();i++) 
		{
			char ch=second.charAt(i);
			if(ch>='0'&&ch<'9')
				count2[ch-48]++;
		}
		
		for(int i=0;i<count1.length;i++) 
		{
			if(count1[i]!=count2[i])
				return false;
		}
		
		return true;
	}
	public static boolean isPrime(int n) 
	{
			for(int i=2;i<=n/2;i++) 
			{
				if(n%i==0) 
				
					return false;		
			}
			
	return true;
	}
	public static void main(String args[])
	
	{
		
		ArrayList<String> alst=new ArrayList<String>();
		for(int i=2;i<=1000;i++) 
		{
			if(isPrime(i)) 
			{
				String str=""+i;
				alst.add(str);
			}
		}
		for(int i=0;i<alst.size()-1;i++) 
		{
			if(alst.get(i)!=" ") 
			{
				int count=0;
				for(int j=i+1;j<alst.size();j++) 
				{
					if(isAnagram(alst.get(i),alst.get(j))) 
					{
						System.out.print(alst.get(j)+" ");
						alst.set(j," ");
						count++;
					}
					
				}
				if(count!=0)
					System.out.println(alst.get(i));	
			}
		}
	}
}
