package org.btm.practiceApp;
public class ReverseWord 
{
	public static void main(String args[])
	{
		String s="Hello Azam Welcome Back";
		String w="",rs="";
		char ch;
		s=s+" ";
		int l=s.length();
		for(int i=0;i<l;i++)
		{
			ch=s.charAt(i);
			if(ch!=' ')
				w=ch+w;
			else
			{
				rs=rs+" "+w;
				w="";
			}
		}
		System.out.println(rs.substring(1));
		
		
	}
}
