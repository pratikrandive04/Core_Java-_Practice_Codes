// 65. Write a Java program that finds numbers greater than the average of an array. 

public class practice{
    public static void main(String args[]){
        
        int array [] = {1,4,17,7,25,3,100};
        
        int sum=0;
        
        for(int i=0; i<array.length;i++){
            sum = sum+array[i];
        }
        
        int avg = sum/array.length;
        
        System.out.println("Average Of Numbers : "+avg);
        System.out.println("Numbers Greater Then Average : ");
        
        for(int i=0; i<array.length; i++){
            if(array[i]>avg){
                System.out.print(array[i]+" ");
            }
        }
        
    }
}