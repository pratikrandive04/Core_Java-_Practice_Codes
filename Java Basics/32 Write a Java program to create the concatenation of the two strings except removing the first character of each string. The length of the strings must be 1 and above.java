// 32 Write a Java program to create the concatenation of the two strings except removing the first character of each string. The length of the strings must be 1 and above.

public class practice {
    public static void main(String args[]) {
        
        String str1 = "Python";
        String str2 = "Tutorial";
        
        if (str1.length() > 1 && str2.length() > 1) {
            String result = str1.substring(1) + str2.substring(1);
            System.out.println(result);
        } else {
            System.out.println("Both strings must have a length of 1 and above.");
        }
    }
}