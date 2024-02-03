package ArrayListProblems;

import java.util.ArrayList;

// 4. Write a Java program to update an array element by the given element.

public class D {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(7);
		numbers.add(3);
		numbers.add(4);
		numbers.add(1);
		
		System.out.println("Before Updating : "+numbers);
		
		numbers.set(0, 5);
		
		System.out.println("After Updating : "+numbers);
		
	}
	
}
