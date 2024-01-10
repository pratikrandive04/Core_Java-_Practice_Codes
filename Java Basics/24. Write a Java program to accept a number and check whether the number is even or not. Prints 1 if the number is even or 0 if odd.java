// 24. Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd.
import java.util.Scanner;

public class practice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Accept a number
        int a = sc.nextInt();
        
        // Check if the number is even or odd
        if (a % 2 == 0) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}