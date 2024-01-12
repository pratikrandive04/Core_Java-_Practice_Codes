 // 68. Write a Java program to move every positive number to the right and every negative number to the left of a given array of integers.
 
 public class practice{
     public static void main(String args[]){
         
        int array [] = {-2,3,4,-1,-3,1,2,-4,0};
        
        int left = 0;
        int right = array.length-1;
        
        int array2 [] = new int [array.length];
        
        
        for(int i = 0; i < array.length; i++){
            if(array[i]>=0){
               array2[right] = array[i];
                right--;
            }
            else{
                array2[left] = array[i];
                left++;
            }
        }
        
        for(int i = 0; i < array2.length; i++){
            System.out.print(array2[i]+" ");
        }
         
     }
 }