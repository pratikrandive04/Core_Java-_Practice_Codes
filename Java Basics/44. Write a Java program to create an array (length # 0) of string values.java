// 44. Write a Java program to create an array (length # 0) of string values. The elements will contain "0", "1", "2" … through ... n-1.

public class practice {
    public static void main(String args[]) {
        
        int n = 5;
        
        // Create an array of string values
        String array[] = new String[n];
        
        // Populate the array with values "0", "1", "2", ..., through "n-1"
        for (int i = 0; i < n; i++) {
            array[i] = String.valueOf(i);
        }
        
        // Print the elements of the array
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}