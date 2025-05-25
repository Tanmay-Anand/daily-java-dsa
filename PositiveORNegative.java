//Java Program to Check if a Number is Positive or Negative

package tPointTech;

import java.util.Scanner;

public class PositiveORNegative {

	public static void main(String[] args) {
		
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check: ");
		num = s.nextInt();
		
		CheckSign(num);

	}
	public static void CheckSign(int num)
	{
		if(num>0)  
		{  
		System.out.println("The number is positive.");  
		}  
		
		else if(num<0)  
		{  
		System.out.println("The number is negative.");  
		}  
		
		else  
		{  
		System.out.println("The number is zero.");  
		}  
	}
}
