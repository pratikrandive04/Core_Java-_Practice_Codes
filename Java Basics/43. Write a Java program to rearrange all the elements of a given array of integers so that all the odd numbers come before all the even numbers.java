// 43. Write a Java program to rearrange all the elements of a given array of integers so that all the odd numbers come before all the even numbers.

public class practice {
    public static void main(String args[]) {
        
        int array[] = {1, 2, 4, 3, 5, 9, 7, 8, 6};
        
        // Pointers to add elements at the front and back
        int addFront = 0;
        int addBack = array.length - 1;
        
        // Array to store the rearranged elements
        int arraySorted[] = new int[array.length];
        
        // Rearrange the elements
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                // If the element is even, add it at the back
                arraySorted[addBack] = array[i];
                addBack--;
            } else {
                // If the element is odd, add it at the front
                arraySorted[addFront] = array[i];
                addFront++;
            }
        }
        
        // Print the rearranged array
        for (int i = 0; i < arraySorted.length; i++) {
            System.out.print(arraySorted[i] + " ");
        }
    }
}
