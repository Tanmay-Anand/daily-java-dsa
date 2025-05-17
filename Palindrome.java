package tPointTech;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		int num;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a number: ");
		num= s.nextInt();
		
		CheckPalindrome(num);
		s.close();
	}

	public static void CheckPalindrome(int num)
	{
		int reversedsum=0;
		int temp= num;
		
		while(temp>0)
		{
			int digit = temp % 10;
			reversedsum = (reversedsum * 10) + digit;
			temp = temp / 10;
		}
		
		
		if(num==reversedsum)
		{
			System.out.println(num + " is a Palindrome.");
		}
		else 
		{
			System.out.println(num + " is NOT a Palindrome.");
		}
	}
}
