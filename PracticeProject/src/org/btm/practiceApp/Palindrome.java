package org.btm.practiceApp;
public class Palindrome 
{
	public static void main(String args[])
	{
		String a="Madam";
		String b="";
		int l=a.length();
		System.out.println(l);
		for(int i=l-1;i>=0;i--)
			b=b+a.charAt(i);
		if(a.equalsIgnoreCase(b))
			System.out.println("String is Palindrome...");
		else
			System.out.println("String is Not Palindrome...");
	}
}
