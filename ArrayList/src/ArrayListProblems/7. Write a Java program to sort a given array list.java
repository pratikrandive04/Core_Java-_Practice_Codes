package ArrayListProblems;

import java.util.ArrayList;
import java.util.Collections;

//7. Write a Java program to sort a given array list.

public class G {

    public static void main(String[] args) {

        // Integer ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(9);
        numbers.add(10);
        numbers.add(1);

        System.out.println("Before Sorting : " + numbers);

        // Sort the integer ArrayList
        Collections.sort(numbers);

        System.out.println("After Sorting : " + numbers);

        System.out.println();

        // String ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Red");
        colors.add("Violet");
        colors.add("Blue");

        System.out.println("Before Sorting : " + colors);

        // Sort the string ArrayList
        Collections.sort(colors);

        System.out.println("After Sorting : " + colors);
    }
}
