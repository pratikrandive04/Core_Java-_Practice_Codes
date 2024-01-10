// 51. Write a Java program to merge two given sorted arrays of integers and create another sorted array.
import java.util.Arrays;

public class practice {
    public static void main(String args[]) {
        
        int array1[] = {1, 2, 3, 7};
        int array2[] = {2, 4, 5, 8};
        
        int newArray[] = new int[array1.length + array2.length];
        
        // Copy elements from array1 to newArray
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }
        
        // Copy elements from array2 to newArray
        for (int i = 0; i < array2.length; i++) {
            newArray[i + array1.length] = array2[i];
        }
        
        // Sort the merged array
        Arrays.sort(newArray);
        
        System.out.println("New Merged And Sorted Array : ");
        
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}