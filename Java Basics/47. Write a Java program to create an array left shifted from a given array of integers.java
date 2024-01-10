// 47. Write a Java program to create an array left shifted from a given array of integers. 

public class practice {
    public static void main(String args[]) {
        
        int array[] = {1, 2, 3, 4, 5, 6};
        
        // Create a new array with the same length as the original array
        int newarray[] = new int[array.length];
        
        // Store the first element of the original array
        int firstElement = array[0];
        
        // Shift each element to the left in the new array
        for (int i = 1; i < array.length; i++) {
            newarray[i - 1] = array[i];
        }
        
        // Set the last element of the new array to the first element of the original array
        newarray[array.length - 1] = firstElement;
        
        // Print the left-shifted array
        for (int i = 0; i < newarray.length; i++) {
            System.out.print(newarray[i] + " ");
        }
    }
}