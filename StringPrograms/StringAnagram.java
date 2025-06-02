package tPointTech;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  

        System.out.println("Enter your FIRST string:");
        String str1 = s.nextLine();  

        System.out.println("Enter your SECOND string:");
        String str2 = s.nextLine();  

       
        stringAnagramCheck(str1, str2);
        
        s.close(); 
    }

    
    public static void stringAnagramCheck(String str1, String str2) {
       
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

       
        if (str1.length() != str2.length()) {
            System.out.println("Both the strings are not anagram");
        } else {
          
            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();

            
            Arrays.sort(string1);
            Arrays.sort(string2);

          
            if (Arrays.equals(string1, string2)) {
                System.out.println("Both the strings are anagram");
            } else {
                System.out.println("Both the strings are not anagram");
            }
        }
    }
}

