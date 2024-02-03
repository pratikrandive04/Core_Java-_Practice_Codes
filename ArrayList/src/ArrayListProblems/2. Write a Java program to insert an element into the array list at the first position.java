package ArrayListProblems;

import java.util.ArrayList;

// 2. Write a Java program to insert an element into the array list at the first position.

public class B {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		// adding some numbers
		numbers.add(4);
		numbers.add(8);
		numbers.add(3);
		numbers.add(5);
		
		System.out.println("List Before Adding : ");
		System.out.println(numbers);
		
		// add element to first place in list
		numbers.add(0, 9);
		
		System.out.println("List After Adding : ");
		System.out.println(numbers);
		
	}
}
