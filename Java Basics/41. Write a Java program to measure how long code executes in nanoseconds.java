 // 41. Write a Java program to measure how long code executes in nanoseconds.
 
 public class practice{
     public static void main(String args[]){
        
        long startTime = System.nanoTime();
        
        int count = 0;
        
        for(int i=0; i<1000;i++){
            count++;
        }
        
        long endTime = System.nanoTime();
        
        long executionTime = endTime-startTime;
        
        System.out.println(count);
        System.out.println("Execution Time In Nanoseconds : "+executionTime);
        
     }
 }