//PROGRAM TO CHECK STRING ANAGRAM OR NOT
package org.bridgelabz.algorithmProgram;
import java.util.Scanner;
public class Anagram 
{
	//MSIN METHOD
	public static void main(String args[])
	{
		String s1=new String();
		String s2=new String();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER FIRST WORD...");
		s1=sc.next();
		System.out.println("ENTER SECOND WORD...");
		s2=sc.next();
		System.out.println(detectAnagram(s1,s2)?"Words are Anagram":"Words are not Anagram");
	}
	//FUNCTION TO FIND STRING ANAGRAM OR NOT AND RETURN
	public static boolean detectAnagram(String first,String second)
	{
		//IF LENGTH OF BOTH WORDS ARE NOT SAME THEN STRING ARE NOT ANAGRAM
		if(first.length()!=second.length())
			return false;
		for(int i=0;i<second.length();i++)
		{
			char c=first.charAt(i);
			if(second.indexOf(c)==-1)
				return false;
		}
		return true;
	}
}
