// 2. Write a Java program to print the sum of two numbers.
import java.util.Scanner;

public class practice{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = a+b;
        
        System.out.print("The Sum Of The Numbers Is : "+sum);
    }
}