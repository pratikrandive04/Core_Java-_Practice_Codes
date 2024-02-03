package ArrayListProblems;

import java.util.ArrayList;

// 18. Write a Java program to print all the elements of an ArrayList using the elements' position.

public class S {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(7);
		numbers.add(9);
		numbers.add(1);
		numbers.add(4);
		
		System.out.println("Position  |  Element");
		
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println("     "+(i+1)+"    |    "+numbers.get(i));
		}

	}

}
