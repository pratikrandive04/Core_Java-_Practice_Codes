// 34. Write a Java program to create a string taking the first three characters from a given string. If the string length is less than 3 use "#" as substitute characters.

public class practice{
    
    public void createString(String str){
        if(str.length()>=3){
            System.out.println(str.substring(0,3));
            
        }
        else{
            System.out.println("###");
        }
        
        
    }
    
    public static void main(String args[]){
        
        practice p1 = new practice();
        
        String str1 = "";
        String str2 = "Pratik";
        
        p1.createString(str1);
        p1.createString(str2);
        
    }
    
}