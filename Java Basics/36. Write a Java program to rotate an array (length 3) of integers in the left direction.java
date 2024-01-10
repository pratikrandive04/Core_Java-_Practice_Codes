// 36. Write a Java program to rotate an array (length 3) of integers in the left direction.

public class practice {
    public static void main(String args[]) {
        int array[] = {20, 30, 40};
        
        // Store the first element in a temporary variable
        int temp = array[0];
        
        // Shift elements to the left
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        
        // Place the first element at the end
        array[array.length - 1] = temp;
        
        // Print the rotated array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}