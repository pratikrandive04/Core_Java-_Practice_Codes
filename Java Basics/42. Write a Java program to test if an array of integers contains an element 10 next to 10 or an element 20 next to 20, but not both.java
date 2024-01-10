// 42. Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20, but not both.

public class Practice {
    public static void main(String[] args) {

        // Sample array of integers
        int array[] = {20, 10, 10, 30, 40, 50};

        // Flags to track occurrences of 10 next to 10 and 20 next to 20
        boolean found1010 = false;
        boolean found2020 = false;

        // Iterate through the array, checking adjacent elements
        for (int i = 0; i < array.length - 1; i++) {
            // Check if the current and next elements are both 10
            if (array[i] == 10 && array[i + 1] == 10) {
                found1010 = true;
            }
            // Check if the current and next elements are both 20
            if (array[i] == 20 && array[i + 1] == 20) {
                found2020 = true;
            }
        }

        // Check if only one of the conditions (10 next to 10 or 20 next to 20) is true
        if (found1010 ^ found2020) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}