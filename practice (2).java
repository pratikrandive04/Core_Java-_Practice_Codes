// 4. Write a Java program that takes a number as input and prints its multiplication table up to 10.
import java.util.Scanner;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        for(int i = 1; i <= 10; i++){
            System.out.println(a+" X "+i+" = "+(a*i));
        }
    }
}