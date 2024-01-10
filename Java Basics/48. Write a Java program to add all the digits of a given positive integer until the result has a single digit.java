// 48.Write a Java program to add all the digits of a given positive integer until the result has a single digit.

import java.util.Scanner;

public class SumDigitsUntilSingleDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a positive integer
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        // Validate input
        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Calculate the sum of digits until a single digit is obtained
        int result = sumDigitsUntilSingleDigit(num);

        // Display the result
        System.out.println("Sum of digits until a single digit is obtained: " + result);
    }

    private static int sumDigitsUntilSingleDigit(int number) {
        while (number > 9) {
            int sum = 0;

            // Extract digits and add them
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }

            number = sum;
        }

        return number;
    }
}
