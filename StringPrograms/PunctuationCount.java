package tPointTech;

import java.util.Scanner;

public class PunctuationCount {

	public static void main(String[] args) {
		
		String sta;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a statement to count: ");
		sta = s.nextLine();
		
		countPunctuation(sta);

	}
	public static void countPunctuation(String sta)
	{
		int count=0;
		for(int i=0; i<sta.length();i++)
		{
			
			if(sta.charAt(i) == '!' || sta.charAt(i) == ',' || sta.charAt(i) == ';' || sta.charAt(i) == '.' ||  sta.charAt(i) == '?' || sta.charAt(i) == '-' ||    
					sta.charAt(i) == '\'' || sta.charAt(i) == '\"' || sta.charAt(i) == ':')   
					{    
					count++;    
					}    
					}    
					System.out.println("The number of punctuations exists in the string is: " + count);    
					}    

}
