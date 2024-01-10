// 14. Write a Java program to convert a binary number to an octal number.

public class practice {
    public static void main(String args[]) {
        
        // Binary number as a string
        String binaryNumber = "111";
        
        // Convert binary to decimal
        int decimalNumber = Integer.parseInt(binaryNumber, 2);
        
        // Convert decimal to octal
        String octNumber = Integer.toOctalString(decimalNumber);
        
        // Print the octal number
        System.out.println("Octal Number: " + octNumber);
    }
}
