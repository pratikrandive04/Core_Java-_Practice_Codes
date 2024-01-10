// 39.Write a Java program to take the last three characters from a given string. It will add the three characters at both the front and back of the string. String length must be greater than three and more.
//Test data: "Python" will be "honPythonhon"

public class practice {
    public static void main(String args[]) {
        
        String str = "Python";
                   
        String subStr = "";
        
        // Extract the last three characters
        for (int i = str.length() - 3; i < str.length(); i++) {
            subStr = subStr + str.charAt(i);
        }
        
        // Print the modified string
        System.out.println(subStr + str + subStr);
    }
}
