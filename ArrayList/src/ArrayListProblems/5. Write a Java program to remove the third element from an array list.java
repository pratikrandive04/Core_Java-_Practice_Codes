package ArrayListProblems;

import java.util.ArrayList;

//5. Write a Java program to remove the third element from an array list.

public class E {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(7);
		numbers.add(4);
		numbers.add(6);
		numbers.add(3);
		
		System.out.println("Before Removing : "+numbers);
		
		// removing third element
		numbers.remove(2);
		
		System.out.println("After Removing : "+numbers);
		
	}
}
