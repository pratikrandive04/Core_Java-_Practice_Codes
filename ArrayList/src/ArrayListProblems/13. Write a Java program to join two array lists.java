package ArrayListProblems;

import java.util.ArrayList;

// 13. Write a Java program to join two array lists.

public class N {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(7);
		numbers.add(9);
		numbers.add(1);
		numbers.add(4);
		
		ArrayList<Integer> numbers2 = new ArrayList<>();
		
		numbers2.add(70);
		numbers2.add(19);
		numbers2.add(16);
		numbers2.add(4);
		
		System.out.println("Before Merging : ");
		System.out.println(numbers);
		System.out.println(numbers2);
		System.out.println();
		
		numbers.addAll(numbers2);
		
		System.out.println("After Merging : ");
		System.out.println(numbers);
	}

}
