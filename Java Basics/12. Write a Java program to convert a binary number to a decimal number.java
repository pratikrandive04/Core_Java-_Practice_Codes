// 12. Write a Java program to convert a binary number to a decimal number.

public class practice {
    public static void main(String args[]) {
        
        // Binary number as a string
        String binaryNumber = "100";
        
        // Parsing binary string to decimal integer
        int decimalNumber = Integer.parseInt(binaryNumber, 2);
        
        // Printing the decimal number
        System.out.println("Decimal Number : "+decimalNumber);
    }
}
