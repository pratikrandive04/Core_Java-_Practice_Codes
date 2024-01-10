// 27. Write a Java program that accepts three integers from the user and returns true if two or more of them (integers) have the same rightmost digit. The integers are non-negative.
import java.util.Scanner;

public class practice {
    public static void main(String args[]) {
     
        Scanner sc = new Scanner(System.in);
     
        int a, b, c;
     
        // Get input from the user for three integers
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
     
        // Extract the rightmost digit for each integer using the modulo operator (%)
        int lastA = a % 10;
        int lastB = b % 10;
        int lastC = c % 10;
     
        // Check if two or more integers have the same rightmost digit
        if (lastA == lastB || lastB == lastC || lastC == lastA || (lastA == lastB && lastB == lastC)) {
            // Print "True" if the condition is met
            System.out.println("True");
        } else {
            // Print "False" if the condition is not met
            System.out.println("False");
        }
    }
}
