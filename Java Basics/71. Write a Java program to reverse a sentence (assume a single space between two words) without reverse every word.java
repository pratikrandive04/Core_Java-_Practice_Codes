// 71. Write a Java program to reverse a sentence (assume a single space between two words) without reverse every word.

public class Practice {
    public static void main(String args[]) {

        String sample = "The quick brown fox jumps over the lazy dog";

        String newString = "";
        int wordEnd = sample.length();

        for (int i = sample.length() - 1; i >= 0; i--) {
            if (i == 0) {
                newString = newString + sample.substring(0, wordEnd);
            } else if (sample.charAt(i) == ' ') {
                newString = newString + sample.substring(i + 1, wordEnd) + " ";
                wordEnd = i;
            }
        }

        System.out.println(newString);
    }
}

