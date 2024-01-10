// 35. Write a Java program to test if 10 appears as the first or last element of an array of integers. The array length must be broader than or equal to 2.

public class practice {
    public static void main(String args[]){
       int array [] = {10, -20, 0, 30, 40, 60, 10};
       
       if(array[0] == 10 || array[array.length-1] == 10){
           System.out.println("True");
       }else{
           System.out.println("False");
       }
    }
}
