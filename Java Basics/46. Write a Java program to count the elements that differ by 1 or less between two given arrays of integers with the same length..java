// 46. Write a Java program to count the elements that differ by 1 or less between two given arrays of integers with the same length.

public class practice {
    public static void main(String args[]) {
        
        int array1[] = {5, 8, 66, 7, 44};
        int array2[] = {5, 7, 77, 2, 46};
        
        int count = 0;
        
        // Iterate through each pair of corresponding elements from the two arrays
        for (int i = 0; i < array1.length; i++) {
            
            // Calculate the absolute difference between the elements
            int difference = Math.abs(array1[i] - array2[i]);
            
            // Check if the difference is less than or equal to 1
            if (difference <= 1) {
                count++;
            }
        }
        
        // Print the count of elements that differ by 1 or less
        System.out.println("Count: " + count);
    }
}
