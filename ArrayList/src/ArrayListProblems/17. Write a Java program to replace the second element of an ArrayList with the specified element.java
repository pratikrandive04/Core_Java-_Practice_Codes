package ArrayListProblems;

import java.util.ArrayList;

// 17. Write a Java program to replace the second element of an ArrayList with the specified element.

public class R {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(7);
		numbers.add(9);
		numbers.add(1);
		numbers.add(4);
		
		System.out.println("ArrayList : "+numbers);
		System.out.println();
		
		// Replace the second element with other number
		numbers.set(1, 5);
		
		System.out.println("After Updating Second Number : ");
		System.out.println(numbers);

	}

}
