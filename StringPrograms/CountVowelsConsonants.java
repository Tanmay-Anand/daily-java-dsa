package tPointTech;

import java.util.Scanner;

public class CountVowelsConsonants {

	public static void main(String[] args) {

		String sta;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a statement to count Vowels and Consonants: ");
		sta = s.nextLine();

		countingVowelsConsonants(sta);
	}

	public static void countingVowelsConsonants(String sta) {
		int vCount = 0;
		int cCount = 0;

		for (int i = 0; i < sta.length(); i++) {
			if (sta.charAt(i) == 'a' || sta.charAt(i) == 'e' || sta.charAt(i) == 'i' || sta.charAt(i) == 'o'
					|| sta.charAt(i) == 'u') {
				vCount++;
			} else if (sta.charAt(i) >= 'a' && sta.charAt(i) <= 'z') {
				cCount++;
			}
		}
		System.out.println("Number of vowels: " + vCount);
		System.out.println("Number of consonants: " + cCount);
	}

}
