package ArrayListProblems;

import java.util.ArrayList;

// 15. Write a Java program to empty an array list.

public class P {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(7);
		numbers.add(9);
		numbers.add(1);
		numbers.add(4);
		
		System.out.println("Before Empty : "+numbers);
		
		numbers.removeAll(numbers);
		
		System.out.println("After Empty : "+numbers);
		
	}

}
