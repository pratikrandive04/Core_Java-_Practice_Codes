// 8. Write a Java program to multiply two binary numbers.

public class pratice {
    public static void main (String args[]){
        
        // take the number as string binary
        String str1 = "10";
        String str2 = "11";
        
        //convert the string to the decimal integer
        int number1 = Integer.parseInt(str1,2);
        int number2 = Integer.parseInt(str2,2);
        
        //multiply the  numbers given
        int mul = number1*number2;
        
        //convert mul back to the binary format
        String binaryMul = Integer.toBinaryString(mul);
        
        //print the result
        System.out.println(binaryMul);
        
    }
}