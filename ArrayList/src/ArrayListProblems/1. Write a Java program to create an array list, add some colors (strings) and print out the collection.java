package ArrayListProblems;

import java.util.ArrayList;

// 1. Write a Java program to create an array list, add some colors (strings) and print out the collection.

public class A {

	public static void main(String[] args) {
		
		// Create an ArrayList to store colors
		ArrayList<String> colors = new ArrayList<String>();
		
		// Add colors to the ArrayList
		colors.add("Green");
		colors.add("Red");
		colors.add("Voilet");
		colors.add("Blue");
		
		// Print out the collection
		for(int i = 0; i<colors.size(); i++) {
			System.out.print(colors.get(i)+" ");
		}
		
	}

}
