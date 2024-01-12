// 60. Write a Java program to print an array after changing the rows and columns of a two-dimensional array.

public class practice{
    public static void main(String args[]){
        
        int array [][] = {{10,20,30,},{40,50,60}};
        
        int array2 [][] = new int [array[0].length][array.length];
        
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                array2[j][i] = array[i][j];
            }
        }
        
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j]+" "); 
            }
            System.out.println();
        }
        
        for(int i = 0; i < array2.length; i++){
            for(int j = 0; j < array2[0].length; j++){
               System.out.print(array2[i][j]+" "); 
            }
            System.out.println();
        }
        
    }
}