// 67. Write a Java program to divide the two given integers using the subtraction operator.

public class practice {
    public static void main(String args[]) {
        int dividend = 625;
        int divisor = 25;

        int quotient = 0;

        while (dividend >= divisor) {
            dividend = dividend - divisor;
            quotient++;
        }

        System.out.println("Quotient : " + quotient);
    }
}
