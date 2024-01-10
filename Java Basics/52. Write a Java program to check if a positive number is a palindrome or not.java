// 52.Write a Java program to check if a positive number is a palindrome or not.
//Input a positive integer: 151
//Is 151 is a palindrome number?
//true

public class practice {
    public static void main(String args[]) {
        
        int n = 151;
        
        int oldNumber = n;
        int newNumber = 0;
        
        boolean isPalindrome = false;
        
        // Reverse the digits of the number
        while (oldNumber != 0) {
            int remainder = oldNumber % 10;
            newNumber = newNumber * 10 + remainder;
            oldNumber = oldNumber / 10;
        }
        
        // Check if the original number is equal to the reversed number
        if (n == newNumber) {
            isPalindrome = true;
        }
        
        System.out.println(isPalindrome);
    }
}