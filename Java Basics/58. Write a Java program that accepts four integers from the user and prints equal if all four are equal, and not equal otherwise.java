//58. Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.
import java.util.Scanner;
public class practice{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        if(a==b && b==c && c==d){
            System.out.println("All Are Equal");
        }
        
        else{
            System.out.println("Not Equal");
        }
        
    }
}