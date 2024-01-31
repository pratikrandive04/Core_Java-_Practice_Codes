// 76. Write a Java program to add one to a positive number represented as an array of digits.
//Sample array: [9, 9, 9, 9] which represents 9999
//Output: [1, 0, 0, 0, 0].

import java.util.ArrayList;

public class practice{
    public static void main(String args[]){
        
        int array[] = {9,9,9,9};
        
        ArrayList<Integer> newList = new ArrayList<>();
        
        String number = "";
        
        for(int i = 0; i<array.length; i++){
            
            String a = Integer.toString(array[i]);
            
            number = number+a;
            
        }
        
        int newNumber = Integer.parseInt(number);
        
        String finalNumber = Integer.toString(newNumber+1);
        
        for(int i = 0; i < finalNumber.length(); i++){
            char ch = finalNumber.charAt(i);
            int temp = Integer.parseInt(String.valueOf(ch));
            
            newList.add(temp);
        }
        
        for(int i = 0; i<newList.size(); i++){
            System.out.print(newList.get(i)+" ");
        }
        
    }
}
