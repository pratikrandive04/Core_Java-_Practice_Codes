// 63. Write a Java program to find the k smallest elements in a given array. Elements in the array can be in any order.
import java.util.Arrays;

public class practice{
    public static void main(String args[]){
        
        int k = 2;
        
        int array [] = {1,4,17,7,25,3,100};
        
        Arrays.sort(array);
        
        for(int i =0; i<k; i++){
            System.out.print(array[i]+" ");
        }
        
    }
}