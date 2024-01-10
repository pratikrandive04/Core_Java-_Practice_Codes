// 37. Write a Java program to swap the first and last elements of an array (length must be at least 1) and create another array.

public class practice {
    public static void main(String args[]) {
        // Original array
        int array[] = {20, 30, 40};
        
        // Get the length of the array
        int length = array.length;
        
        // Create a new array to store the result
        int newArray[] = new int[length];
        
        // Check if the array has at least one element
        if (length >= 1) {
            // Swap the first and last elements in the new array
            newArray[0] = array[array.length - 1];

            // Copy the elements from the original array to the new array, excluding the first and last elements
            for (int i = 1; i <= array.length - 2; i++) {
                newArray[i] = array[i];
            }

            // Place the first element from the original array at the last position in the new array
            newArray[array.length - 1] = array[0];
        }

        // Print the resulting array
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}