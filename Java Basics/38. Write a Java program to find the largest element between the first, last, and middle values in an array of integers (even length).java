// 38.Write a Java program to find the largest element between the first, last, and middle values in an array of integers (even length).

public class practice{
    public static void main(String args[]){
        
        int array [] = {20, 30, 40, 50, 60};
        
        if(array[0]>array[(array.length-1)/2] && array[0]>array[array.length-1]){
            System.out.println(array[0]);
        }
        
        else if(array[(array.length-1)/2]>array[0] && array[(array.length-1)/2]>array[array.length-1]){
            System.out.println(array[(array.length-1)/2]);
        }
        
        else{
            System.out.println(array[array.length-1]);
        }
        
        
    }
}