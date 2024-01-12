// 69. Write a Java program to transform a given integer into String format.

public class pratice{
    public static void main(String args[]){
        
        int a = 4;
        
        String newA = Integer.toString(a);
        
        System.out.println(newA);
        System.out.println(newA.getClass().getSimpleName());

    }
}