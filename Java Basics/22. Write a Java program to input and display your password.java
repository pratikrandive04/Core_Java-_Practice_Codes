// 22. Write a Java program to input and display your password.
import java.util.Scanner;
public class practice{
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        String password = sc.nextLine();
        
        System.out.print("The Password You Entered Is : "+password);
        
    }
}