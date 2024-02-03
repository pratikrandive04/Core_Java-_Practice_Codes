package ArrayListProblems;

import java.util.ArrayList;
import java.util.Scanner;

//6. Write a Java program to search for an element in an array list.

public class F {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(4);
		numbers.add(9);
		numbers.add(10);
		numbers.add(1);
		
		boolean numbersFound = false;
		System.out.println("Enter Number To Find : ");
		int n = sc.nextInt();
		
		for(int i=0; i<numbers.size();i++) {
			if(numbers.get(i)==n){	
				numbersFound=true;
				break;
			}
		}
		
		if (numbersFound==true) {
			System.out.println("Number Is Found !");
		}
		else {
			System.out.println("Number Is Not Found !");
		}
		
		System.out.println();
		
		//finding string
		
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Green");
        colors.add("Red");
        colors.add("Violet");
        colors.add("Blue");
        
        boolean colorFound = false;
		System.out.println("Enter color To Find : ");
		String color = sc.next();
		
		for(int i=0; i<colors.size();i++) {
			if(colors.get(i).equals(color)){	 // case sensitive
				colorFound=true;
				break;
			}
		}
		
		if (colorFound==true) {
			System.out.println("Color Is Found !");
		}
		else {
			System.out.println("Color Is Not Found !");
		}
	}
}
