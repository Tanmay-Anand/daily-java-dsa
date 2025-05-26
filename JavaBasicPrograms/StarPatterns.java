package tPointTech;

import java.util.Scanner;

public class StarPatterns {

	public static void main(String[] args) {
		
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		num = s.nextInt();
		
		printRightTriangleStarPattern(num);
		printLeftTriangleStarPattern(num);
		printPyramidStarPattern(num);
		printDiamondStarPattern(num);
	}
	
//	* 
//	* * 
//	* * * 
//	* * * * 
	
	public static void printRightTriangleStarPattern(int num)
	{
		for(int i=1; i <= num; i++)
		{
			for(int j=1; j <= i; j++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}
	
//	      * 
//	    * * 
//	  * * * 
//	* * * * 
	
	public static void printLeftTriangleStarPattern(int num)
	{
		for (int i = 1; i <= num; i++) {
			//Space
	        for (int j = 1; j <= num - i; j++) {
	            System.out.print("  "); 
	        }
	        //Star
	        for (int k = 1; k <= i; k++) {
	            System.out.print("* ");
	        }


	        System.out.println();
	    }
	}
	
//	    * 
//	   * * 
//	  * * * 
//	 * * * * 
	 
	public static void printPyramidStarPattern(int num)
	{
		for (int i = 1; i <= num; i++) {
			//Space
	        for (int j = 1; j <= num - i; j++) {
	            System.out.print(" "); 
	        }
	        //Star
	        for (int k = 1; k <= i; k++) {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
	
//    * 
//   * * 
//  * * * 
// * * * * 	
//  * * * 	
//   * *
//    *
	
	public static void printDiamondStarPattern(int num)
	{
		for (int i = 1; i <= num; i++) {
			//Space
	        for (int j = 1; j <= num - i; j++) {
	            System.out.print(" "); 
	        }
	        //Star
	        for (int k = 1; k <= i; k++) {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
		for (int i = num - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}

}


