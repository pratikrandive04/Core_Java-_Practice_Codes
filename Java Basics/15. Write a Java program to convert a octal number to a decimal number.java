// 15. Write a Java program to convert a octal number to a decimal number.

public class practice {
    public static void main(String args[]) {
        
        // Octal number as a string
        String octal = "10";
        
        // Convert octal to decimal
        int decimalNumber = Integer.parseInt(octal, 8);
        
        // Print the decimal number
        System.out.println("Decimal Number: " + decimalNumber);
    }
}
