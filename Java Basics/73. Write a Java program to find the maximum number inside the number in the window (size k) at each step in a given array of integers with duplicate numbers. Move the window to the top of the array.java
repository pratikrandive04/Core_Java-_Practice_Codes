 // 73. Write a Java program to find the maximum number inside the number in the window (size k) at each step in a given array of integers with duplicate numbers. Move the window to the top of the array.
 
 public class practice{
     public static void main(String args[]){
         
        int array [] = {1,2,3,4,5,6,7,8,8}; 
        
        int k=3;
        
        for(int i = 0; i <= array.length-k; i++){
            int max = array[0];
            for(int j = 1; j < k; j++){
                if(array[i+j]>max){
                    max = array[i+j];
                }
            }
            
            System.out.println(max);
        }
         
     }
 }