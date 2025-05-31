//Total number of characters in a string

package tPointTech;

import java.util.Scanner;

public class StringFrequency {

	public static void main(String[] args) {
		
		String sta;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a Statement to count: ");
		sta= s.nextLine();
		
		CountString(sta);

	}
	public static void CountString(String sta)
	{
		int count = 0;
		for(int i=0; i< sta.length(); i++)
		{
			  if(sta.charAt(i) != ' ')    
	                count++;   
		}
		System.out.println("total number of characters in a string is: " + count);
	}

}
