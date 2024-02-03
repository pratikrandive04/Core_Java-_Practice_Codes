package ArrayListProblems;

import java.util.ArrayList;

// 14. Write a Java program to clone an array list to another array list. 

public class O {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(7);
		numbers.add(9);
		numbers.add(1);
		numbers.add(4);
		
		System.out.println("ArrayList : "+numbers);
		
		ArrayList<Integer> numbers2 = new ArrayList<>(numbers); // cloning
		
		System.out.println("Cloned ArrayList : "+numbers2);
		
	}
}
