 // 30. Write a Java program to capitalize the first letter of each word in a sentence.
 
 public class practice{
     public static void main(String args[]){
        
        String str = "the quick brown fox jumps over the lazy dog.";
        
        String newStr = "";
        
        char firstLetter = str.charAt(0);
        
        firstLetter = Character.toUpperCase(firstLetter);
        
        newStr = newStr+firstLetter;
        
        for(int i = 1; i<str.length();i++){
            if(str.charAt(i-1)==' '){
                char letter = str.charAt(i);
                letter = Character.toUpperCase(letter);
                newStr= newStr+letter;
            }
            
            else{
                newStr= newStr+str.charAt(i);
            }
        }
        
        System.out.print(newStr);
        
     }
 }