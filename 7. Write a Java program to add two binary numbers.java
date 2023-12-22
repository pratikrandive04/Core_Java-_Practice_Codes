// 7. Write a Java program to add two binary numbers.

public class practice{
    public static void main(String args[]){
        
        //take input as a string
        String str1 = "10";
        String str2 = "11";
        
        //convert the string into the decimal integers
        int num1 = Integer.parseInt(str1,2);
        int num2 = Integer.parseInt(str2,2);
        
        //add these two numbers
        int sum = num1+num2;
        
        //convvert the sum into binary number
        String binarySum = Integer.toBinaryString(sum);
        
        //print the value
        System.out.print(binarySum);
        
    }
}
