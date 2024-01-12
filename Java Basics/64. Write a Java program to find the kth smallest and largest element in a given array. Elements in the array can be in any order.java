// 64. Write a Java program to find the kth smallest and largest element in a given array. Elements in the array can be in any order.

import java.util.Arrays;

public class practice{
    public static void main(String args[]){
        
        int k = 2;
        
        int array[] = {1,4,17,7,25,3,100}; 
                      
        Arrays.sort(array);
        
        System.out.println(k+"th Smallest :"+array[k-1]);
        System.out.println(k+"th Largest :"+array[array.length-k]);
        
    }
}