// 74. Write a Java program that partitions an array of integers into even and odd numbers.

public class practice{
    public static void main(String args[]){
        
        int array[] = {7,2,4,1,3,5,6,8,2,10};
        
        int array2[] = new int [array.length];
        
        int left = 0;
        int right = array.length-1;
        
        for(int i = 0; i<array.length; i++){
            if(array[i]%2==0){
                array2[left] = array[i];
                left++;
            }
            else{
                array2[right] = array[i];
                right--;
            }
        }
        
        for(int i = 0; i<array2.length; i++){
            System.out.print(array2[i]+" ");
        }
        
    }
}