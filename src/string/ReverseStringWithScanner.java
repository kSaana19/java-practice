package string;

import java.util.Scanner;

import java.util.Scanner;

public class ReverseStringWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Reverse the string using StringBuilder
        String reversedString = reverseString(inputString);

        // Display the reversed string
        System.out.println("Reversed String: " + reversedString);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    private static String reverseString(String str) {
        // Use StringBuilder to reverse the string
        return new StringBuilder(str).reverse().toString();
    }
}