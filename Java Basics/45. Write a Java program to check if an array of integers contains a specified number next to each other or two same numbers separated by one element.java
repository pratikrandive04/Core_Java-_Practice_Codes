// 45. Write a Java program to check if an array of integers contains a specified number next to each other or two same numbers separated by one element.

public class practice {
    public static void main(String args[]) {
        
        int array[] = {2, 3, 5, 4, 6, 4, 9, 8};
        
        // Flag to indicate whether the specified condition is found
        boolean isFound = false;
        
        // Iterate through the array up to the second-to-last element
        for (int i = 0; i < array.length - 2; i++) {
            // Check if the current element is equal to the next element or the element after the next
            if (array[i] == array[i + 1] || array[i] == array[i + 2]) {
                // Set the flag to true and break out of the loop
                isFound = true;
                break;
            }
        }
       
        // Print whether the specified condition is found
        System.out.println(isFound);
    }
}