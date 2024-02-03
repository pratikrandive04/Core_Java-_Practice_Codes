package ArrayListProblems;

import java.util.ArrayList;

// 12.  Write a Java program that swaps two elements in an array list.

public class M {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(7);
		numbers.add(9);
		numbers.add(1);
		numbers.add(4);
		
		int swapElement = 9;
		int withElement = 4;
		
		System.out.println("Before Swaping : "+numbers);
		
		int index1 = numbers.indexOf(swapElement);
		int index2 = numbers.indexOf(withElement);
		
		numbers.set(index1, withElement);
		numbers.set(index2, swapElement);
		
		System.out.println("After Swaping : "+numbers);
	}
}
