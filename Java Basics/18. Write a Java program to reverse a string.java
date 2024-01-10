// 18. Write a Java program to reverse a string.

public class practice {
    public static void main(String args[]) {

        // Input string
        String str = "Pratik";

        // Initialize an empty string to store the reversed version
        String reverse = "";

        // Iterate through the characters of the input string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            // Append each character to the reversed string
            reverse = reverse + str.charAt(i);
        }

        // Print the reversed string
        System.out.println(reverse);
    }
}