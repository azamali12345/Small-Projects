package org.bridgelabz.practiceApp;
import java.util.*;
public class Binary
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER A NUMBER TO CONVERT INTO BINARY...");
		String binaryString =new String();
		binaryString=sc.nextLine();
		System.out.println("Binary representation of the number: " + binaryString);
		
		//stores swapped binary nibbles
		//int SwappedBinary = utility.swapNibbles(binaryString);
		int swapperBinary=swapNibbles(binaryString);
		System.out.println("Binary after swapping: " + SwappedBinary);
		
		//stores new integer
		int swappedBinaryInteger = utility.binaryToInteger(SwappedBinary);
		System.out.println("Number after swapping nibbles: " + swappedBinaryInteger);;
		
		//checks if number is power of two and prints
		if(utility.isPowerOfTwo(SwappedBinary)) {
			System.out.println("The number is power of two");
		} else {
			System.out.println("The number is not power of two");
		}
		scanner.close();
	}
	/**
	 * @param number
	 * @returns string representing binary of number
	 */
	public String toBinary(int number) {
		if(number == 1) {
			return String.valueOf(number);
		}
		int remainder = number % 2;
		return toBinary(number / 2) + String.valueOf(remainder);
	}
	
	/** Converts binary number to decimal. **/
	public int binaryToInteger(int binary) {
		String binaryString = String.valueOf(binary);
		int number = 0;
		for (int index = 0; index < binaryString.length(); index++) {
			int tempDigit = binaryString.charAt(index) - '0';
			number = number * 2 + tempDigit; 
		}
		return number;
	}
	
	/**	Swaps nibbles in the given binary **/
	public int swapNibbles(String binaryString) {
		int size = binaryString.length();
		for(int i = 0; i < 8 - size; i++) {
			binaryString = "0" + binaryString;
		}
		String nibble1 = binaryString.substring(0, 4);
		String nibble2 = binaryString.substring(4);
		return Integer.parseInt(nibble2 + nibble1);
	}
	
	/** Returns true if number is power of two **/
	public boolean isPowerOfTwo(int binary) {
		String binaryString = String.valueOf(binary);
		
		for (int index = 1; index < binaryString.length(); index++) {
			if(binaryString.charAt(index) != '0') {
				return false;
			}
		}
		return true;
}

}