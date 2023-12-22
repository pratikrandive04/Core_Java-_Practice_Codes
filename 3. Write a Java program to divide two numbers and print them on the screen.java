// 3. Write a Java program to divide two numbers and print them on the screen.
import java.util.Scanner;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int division = a/b;
        
        System.out.println("Division Of "+a+" By "+b+ " Is : "+division);
    }
}
