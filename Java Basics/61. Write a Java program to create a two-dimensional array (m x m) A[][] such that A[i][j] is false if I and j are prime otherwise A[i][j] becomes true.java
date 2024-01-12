 //61. Write a Java program to create a two-dimensional array (m x m) A[][] such that A[i][j] is false if I and j are prime otherwise A[i][j] becomes true.
 
 public class practice{
     
     boolean checkPrime(int a){
         
         int counter =0;
         
         if(a==1){
             return true;
         }
         
         if(a==0){
             return false;
         }
         
         for(int i = 2; i<=a; i++){
             if(a%i==0){
                 counter++;
             }
         }
         
        if(counter==1){
            return true;
        }
        else{
            return false;
        }
     }
     
     public static void main(String args[]){
         
         int m = 3;
         
         practice p1 = new practice();
         
         String array[][] = new String [m][m];
         
         for(int i = 0; i<array.length; i++){
             for(int j = 0; j<array[0].length; j++){
                 
                 if(p1.checkPrime(i)==true && p1.checkPrime(j)==true){
                     array[i][j]="False";
                 }
                 else{
                     array[i][j]="True";
                 }
                 
             }
         }
         
         
         for(int i = 0; i<array.length; i++){
             for(int j = 0; j<array[0].length; j++){
                 
                 System.out.print(array[i][j]+" "); 
                 
             }
             System.out.println();
         }
         
     }
 }