// 77. Write a Java program to find the length of the last word in a given string. The string contains upper/lower-case alphabets and empty space characters like ' '.

public class Practice {
    public static void main(String args[]) {
        String str = "The length of last word";

        int count = 0;
        int i = str.length() - 1;

        while (str.charAt(i) != ' ' && i >= 0) {
            count++;
            i--;
        }

        System.out.println(count);
    }
}