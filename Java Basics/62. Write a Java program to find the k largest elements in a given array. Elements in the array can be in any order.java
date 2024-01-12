// 62. Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.
import java.util.Arrays;

public class practice {
    public static void main(String args[]){
        
        int k = 4;
        
        int array[] = {1,4,17,7,25,3,100};
        
        Arrays.sort(array);
        
        for(int i = array.length-1; i>array.length-k-1; i--){
            System.out.print(array[i]+" ");
        }
        
    }
}