package ArrayListProblems;

import java.util.ArrayList;

//11. Write a Java program to compare two array lists.

public class K {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(7);
		numbers.add(9);
		numbers.add(1);
		numbers.add(4);
		
		ArrayList<Integer> numbers2 = new ArrayList<>();
		
		numbers2.add(10);
		numbers2.add(9);
		numbers2.add(1);
		numbers2.add(4);
		
		if (numbers.equals(numbers2)) {
			System.out.println("Both Are Equal !");
		}
		else {
			System.out.println("Both Are Not Equal !");
		}
		
	}
}
