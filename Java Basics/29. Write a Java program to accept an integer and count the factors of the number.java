// 29. Write a Java program to accept an integer and count the factors of the number.

import java.util.Scanner;

public class practice {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        int count = 0;
        
        // Find and count factors of the given number
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        
        // Print the total count of factors
        System.out.println();
        System.out.println("Total Factors: " + count);
    }
}