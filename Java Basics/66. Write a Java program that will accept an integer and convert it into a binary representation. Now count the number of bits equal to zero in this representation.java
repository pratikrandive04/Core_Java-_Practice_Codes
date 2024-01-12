// 66.Write a Java program that will accept an integer and convert it into a binary representation. Now count the number of bits equal to zero in this representation.

public class practice{
    public static void main(String args[]){
        
        int number = 25;
        
        String binaryValue = Integer.toBinaryString(number);
        
        int value = Integer.parseInt(binaryValue);
        
        System.out.println("Binary Value Of "+number+" Is : "+value);
        
        int counter=0;
        
        while(value!=0){
            int remainder = value%10;
            if(remainder==0){
                counter++;
            }
            value = value/10;
        }
        
        System.out.println("Number Of Zeros : "+counter);
        
    }
}