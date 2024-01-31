//Review 

// 72. Write a Java program to find the median of the numbers inside the window (size k) at each step in a given array of integers with duplicate numbers. Move the window to the array start.
import java.util.Arrays;

public class Practice {
    public static void main(String args[]) {

        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 8};

        int k = 3;

        for (int i = 0; i <= array.length - k; i++) {
            int[] window = Arrays.copyOfRange(array, i, i + k);
            Arrays.sort(window);

            int median;
            if (k % 2 == 0) {
                // If the window size is even, take the average of the middle elements
                median = (window[k / 2 - 1] + window[k / 2]) / 2;
            } else {
                // If the window size is odd, take the middle element
                median = window[k / 2];
            }

            System.out.println("Median for window starting at index " + i + ": " + median);
        }
    }
}
