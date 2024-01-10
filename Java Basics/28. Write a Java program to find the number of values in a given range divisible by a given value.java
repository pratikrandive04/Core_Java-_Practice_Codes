// 28. Write a Java program to find the number of values in a given range divisible by a given value.
//For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p

public class practice {
    public static void main(String args[]) {
        
        // Given values
        int x = 5;
        int y = 20;
        int p = 3;
        int count = 0;
        
        // Find and count numbers in the range x..y divisible by p
        for (int i = x; i <= y; i++) {
            if (i % p == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        
        // Print the total count
        System.out.println();
        System.out.println("Total Numbers: " + count);
    }
}
