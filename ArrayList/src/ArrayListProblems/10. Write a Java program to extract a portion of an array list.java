package ArrayListProblems;

import java.util.ArrayList;
import java.util.Iterator;

//10. Write a Java program to extract a portion of an array list.

public class J {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(7);
		numbers.add(9);
		numbers.add(1);
		numbers.add(4);
		
		int from = 1;
		int till = 3;
		
		for(int i = from; i <=till; i++) {
			System.out.print(numbers.get(i)+" ");
		}

	}

}
