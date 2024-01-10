// 13. Write a Java program to convert a binary number to a hexadecimal number.

public class practice {
    public static void main(String args[]) {
        
        // Binary number as a string
        String binaryNumber = "1101";
        
        // Convert binary to decimal
        int decimalNumber = Integer.parseInt(binaryNumber, 2);
        
        // Convert decimal to hexadecimal
        String hexNumber = Integer.toHexString(decimalNumber);
        
        // Print the hexadecimal number
        System.out.println("Hexadecimal Number: " + hexNumber);
    }
}