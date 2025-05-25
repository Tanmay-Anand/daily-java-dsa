package tPointTech;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		
		int limit;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		limit= s.nextInt(); 
		
		printFibonacci(limit);
	}
	
	public static void printFibonacci(int limit)
	{
		System.out.print("0 1 ");
		int temp=0,a=0,b=1;
		while(temp<limit)
		{
			temp = a+b;
			a=b;
			b=temp;
			System.out.print(temp + " ");
		}
	}

}
