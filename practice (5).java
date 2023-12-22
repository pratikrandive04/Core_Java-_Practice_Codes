// 9. Write a Java program to convert an integer number to a binary number.

public class practice{
    public static void main(String args[]){
        int a=5;
        
        String binary = Integer.toBinaryString(a);
        
        System.out.println("Binary Number Is : "+binary);
        
    }
}