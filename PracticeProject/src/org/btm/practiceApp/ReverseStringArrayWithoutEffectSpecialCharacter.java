package org.btm.practiceApp;
import java.util.Arrays;
import java.util.HashSet;
public class ReverseStringArrayWithoutEffectSpecialCharacter 
{
	static HashSet<Character> invalidChars = new HashSet<Character>(Arrays.asList(',', '?', ':','!','$'));

		    public static char[] reverseSkippingSpecialChars(char[] charArray) 
		    {
		        int l = 0;
		        int r = charArray.length - 1;
		        for (int i = 0; i < charArray.length; i++) 
		        {

		            if (r <= l) 
		            {
		                break;
		            }
		            if (!isInvalidChar(charArray[l]) && !isInvalidChar(charArray[r])) 
		            {
		            	charArray = swapChars(charArray, l, r);
		                l++;
		                r--;
		            } 
		            else if (isInvalidChar(charArray[l])) 
		            {
		            	l++;
		            } 
		            else if (isInvalidChar(charArray[r])) 
		            {
		                r--;
		            }
		        }
		        return charArray;
		    }

		    public static char[] swapChars(char[] charArray, int index1, int index2) 
		    {
		        char temp = charArray[index1];
		        charArray[index1] = charArray[index2];
		        charArray[index2] = temp;
		        return charArray;
		    }

		    public static boolean isInvalidChar(char character) 
		    {
		        return invalidChars.contains(character);
		    }

		    public static void main(String args[]) 
		    {
		        char[] charArray = new char[]{'a', 'b', 'c', 'd', '?', 'f', 's', ':', 'w'};

		        System.out.println(reverseSkippingSpecialChars(charArray));
		    }
		


}
	

