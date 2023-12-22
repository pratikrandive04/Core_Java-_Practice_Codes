// 10. Write a Java program to convert a decimal number to a hexadecimal number.

public class practice{
    public static void main(String args[]){
        int  a= 15;
        
        String HexNum = Integer.toHexString(a);
        
        System.out.print(HexNum);
    }
}
