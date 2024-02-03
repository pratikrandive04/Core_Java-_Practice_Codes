package ArrayListProblems;

import java.util.ArrayList;

// 3. Write a Java program to retrieve an element (at a specified index) from a given array list.

public class C {
    
    public static void main(String[] args) {
        
        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();
        
        // Add some colors to the ArrayList
        colors.add("Green");
        colors.add("Red");
        colors.add("Violet");
        colors.add("Blue");
        
        // Retrieve an element at a specified index (index 3)
        System.out.println("Element at index 3: " + colors.get(3));
    }
}
