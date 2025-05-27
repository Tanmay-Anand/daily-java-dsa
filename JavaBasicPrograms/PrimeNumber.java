package tPointTech;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Created Scanner

        System.out.print("Enter a number to check if it's prime: ");
        int num = scanner.nextInt(); // Read input

        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }

        scanner.close(); // Close Scanner
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false; // 0 and 1 are not prime

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // not prime
            }
        }
        return true; // prime
    }
}
