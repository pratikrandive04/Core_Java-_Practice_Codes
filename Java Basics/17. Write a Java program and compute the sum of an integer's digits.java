// 17. Write a Java program and compute the sum of an integer's digits.

public class practice {
    public static void main(String args[]) {
        
        // Input integer
        int number = 25;
        int sum = 0;
        
        // Compute the sum of digits
        while (number != 0) {
            int remainder = number % 10;
            sum = sum + remainder;
            number = number / 10;
        }
        
        // Print the sum
        System.out.println("Sum: " + sum);
    }
}
