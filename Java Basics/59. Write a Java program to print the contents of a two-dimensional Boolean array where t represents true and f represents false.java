// 59. Write a Java program to print the contents of a two-dimensional Boolean array where t represents true and f represents false.

public class Practice {
    public static void main(String args[]) {

        boolean array[][] = {{true, false, true}, {false, false, true}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == true) {
                    System.out.print("t ");
                } else {
                    System.out.print("f ");
                }
            }
            System.out.println(); // Add a newline after each row
        }
    }
}