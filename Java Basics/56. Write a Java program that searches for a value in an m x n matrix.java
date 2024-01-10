// 56.Write a Java program that searches for a value in an m x n matrix.

public class practice {
    public static void main(String args[]) {
        
        int n = 2;
        int m = 3;
        
        int a[][] = new int[n][m]; 
        
        a[0][0] = 1;
        a[0][1] = 4;
        a[0][2] = 3;
        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;
        
        int find = 4;
        boolean found = false;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == find) {
                    System.out.println("Found At: [" + i + "][" + j + "]");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        
        if (!found) {
            System.out.println("Value not found in the matrix.");
        }
    }
}