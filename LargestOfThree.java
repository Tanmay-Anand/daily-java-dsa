//Java Program to Find Largest of Three Numbers

package tPointTech;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the FIRST number: ");
		num1= s.nextInt();
		System.out.println("Enter the SECOND number: ");
		num2= s.nextInt();
		System.out.println("Enter the THIRD number: ");
		num3= s.nextInt();

		CheckLargestOfThree(num1, num2, num3);
	}
	
	public static void CheckLargestOfThree(int num1, int num2, int num3)
	{
		if(num1 > num2)
		{
			if(num1 > num3)
			{
				System.out.println(num1 + " is the largest of three.");
			}
			else 
			{
				System.out.println(num3 + " is the largest of three.");
			}
		}
		else if (num2 > num3)
		{
			System.out.println(num2 + " is the largest of three.");
		}
		else
		{
			System.out.println(num3 + " is the largest of three.");
		}
	}
}
