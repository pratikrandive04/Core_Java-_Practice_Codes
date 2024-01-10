// 40. Write a Java program starting with an integer n, divide it by 2 if it is even, or multiply it by 3 and add 1 if it is odd. Repeat the process until n = 1.

public class practice{
    public static void main(String args[]){
        
        int n = 9;
        
        if(n%2==0){
            while(n!=1){
                System.out.println(n);
                n = n/2;
            }
        }
        else{
            n = ((n*3)+1);
            while(n!=0){
                System.out.println(n);
                n = n/2;
            }
        }
        
    }
}