// 16. Write a Java program to convert a octal number to a binary number.

public class practice {
    public static void main(String args[]) {
        
        // Octal number as a string
        String octal = "7";
        
        // Convert octal to decimal
        int decimal = Integer.parseInt(octal, 8);
        
        // Convert decimal to binary
        String binary = Integer.toBinaryString(decimal);
        
        // Print the binary number
        System.out.println("Binary Number: " + binary);
    }
}