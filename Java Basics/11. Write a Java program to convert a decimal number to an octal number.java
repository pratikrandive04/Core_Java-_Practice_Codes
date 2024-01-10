// 11. Write a Java program to convert a decimal number to an octal number.

public class practice{
    public static void main(String args[]){
        
        int a = 15;
        
        String octalNumber = Integer.toOctalString(a);
        
        System.out.println(octalNumber);
        
    }
}