// 78. Write a Java program to accept a positive number and repeatedly add all its digits until the result has only one digit.

public class practice{
    
    public int doSum(int i){
        
        int a = i;
        
        int sum = 0;
        
        while(a!=0){
            int remainder = a%10;
            sum = sum+remainder;
            a = a/10;
        }
        
        return sum;
    }
    
    public static void main(String args[]){
        
        int a = 1452;
        
        
        practice p1 = new practice();
        
        while(a>10){
            a=p1.doSum(a);
            
        }
        
        System.out.println(a);
        
    }
}