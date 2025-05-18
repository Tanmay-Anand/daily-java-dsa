package tPointTech;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		num = s.nextInt();
		s.close();
		
		printFactorial(num);

	}
	public static void printFactorial(int num)
	{
		int temp=1;
			for(int i=1; i<=num; i++)
			{
				temp = temp * i;
				
			}
			System.out.println(temp);
	}
		

}
