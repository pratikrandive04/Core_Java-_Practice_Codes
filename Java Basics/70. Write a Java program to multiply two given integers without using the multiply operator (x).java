// 70. Write a Java program to multiply two given integers without using the multiply operator (*).

public class practice{
    public static void main(String args[]){
        
        int firstNumber = 25;
        int secondNumber = 5;
        
        int multiply = 0;
        
        for(int i = 1; i<=secondNumber; i++){
            multiply = multiply + firstNumber;
        }
        
        System.out.println("The Final Answer : "+multiply);
        
    }
}