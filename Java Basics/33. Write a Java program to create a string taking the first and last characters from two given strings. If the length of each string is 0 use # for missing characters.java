// 33. Write a Java program to create a string taking the first and last characters from two given strings. If the length of each string is 0 use "#" for missing characters.

public class practice{
    public static void main(String args[]){
        
        String str1 = "Python";
        String str2 = "";
        
        String str = "";
        
        if(str1.length()>0){
            str = str+str1.charAt(0);
        }
        else{
            str = str+'#';
        }
        
        if(str2.length()>0){
            str = str+str2.charAt(str2.length()-1);
        }
        else{
            str = str+'#';
        }
        
        
        System.out.println(str);
    }
}