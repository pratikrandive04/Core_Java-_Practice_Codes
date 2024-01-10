// 55.Write a Java program to get the first occurrence (Position starts from 0.) of a string within a given string.

public class practice{
    public static void main(String args[]){
        
        String a = "Pratik";
        
        String toFind = "tik";
        
        for(int i = 0; i <= a.length()-toFind.length(); i++){
            String sub = a.substring(i,i+toFind.length());
            if(sub.equals(toFind)){
                System.out.println(sub);
                System.out.println("Found At Starting From : "+i);
                break;
            }
        }
        
    }
}