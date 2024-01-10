// 50. Write a Java program to compute the number of trailing zeros in a factorial.

public class practice {
    public static void main(String args[]) {
        
        int n = 10;
        
        int factorial = 1;
        
        // Calculate the factorial of n
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }
        
        System.out.println("Factorial of " + n + " is : " + factorial);
        
        // Count the number of trailing zeros in the factorial
        int num = factorial;
        int count = 0;
        while (num % 10 == 0) {
            count++;
            num = num / 10;
        }
        
        System.out.println("Number of trailing zeros : " + count);
    }
}