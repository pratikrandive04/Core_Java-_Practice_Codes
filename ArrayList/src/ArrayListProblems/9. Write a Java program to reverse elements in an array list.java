package ArrayListProblems;

import java.util.ArrayList;
import java.util.Collections;

//9. Write a Java program to reverse elements in an array list.

public class I {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(8);
		numbers.add(10);
		numbers.add(3);
		numbers.add(7);
		
		System.out.println("Before Reverse : "+numbers);
		
		Collections.reverse(numbers);
		
		System.out.println("After Reverse : "+numbers);
		
	}
}
