package ArrayListProblems;

import java.util.ArrayList;

//16. Write a Java program to test whether an array list is empty or not.

public class Q {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
//		numbers.add(7);
//		numbers.add(9);
//		numbers.add(1);
//		numbers.add(4);
		
		if (numbers.isEmpty()==true) {
			System.out.println("List Is Empty !");
		}
		else {
			System.out.println("List Is Not Empty !");
		}

	}

}
