package ArrayListProblems;

import java.util.ArrayList;

//10. Write a Java program to copy one array list into another.

public class H {

    public static void main(String[] args) {
        
        // Original ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(9);
        numbers.add(10);
        numbers.add(1);
        
        // Copying the original ArrayList into a new one
        ArrayList<Integer> newNumbers = new ArrayList<>(numbers);
        
        // Printing both lists to verify the copy
        System.out.println("Old List: " + numbers);
        System.out.println("New List: " + newNumbers);
    }
}
