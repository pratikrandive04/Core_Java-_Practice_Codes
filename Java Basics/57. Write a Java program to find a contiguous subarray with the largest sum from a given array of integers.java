// 57.Write a Java program to find a contiguous subarray with the largest sum from a given array of integers.
//Note: In computer science, the maximum subarray problem is the task of finding the contiguous subarray within a one-dimensional array of numbers which has the largest sum. For example, for the sequence of values −2, 1, −3, 4, −1, 2, 1, −5, 4; the contiguous subarray with the largest sum is 4, −1, 2, 1, with sum 6.

import java.util.Arrays;

public class Practice {
    public static void main(String args[]) {

        int array[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j <= array.length; j++) {
                int sub[] = Arrays.copyOfRange(array, i, j);

                int arraySum = 0;

                for (int k = 0; k < sub.length; k++) {
                    arraySum = arraySum + sub[k];
                }

                if (sum < arraySum) {
                    sum = arraySum;
                }
            }
        }

        System.out.println(sum);

    }
}
