 // 31. Write a Java program to find the penultimate (next to the last) word in a sentence.
 
public class practice {
    public static void main(String args[]) {
        String str = "The quick brown fox jumps over the lazy dog.";

        // Remove leading and trailing whitespaces
        str = str.trim();

        String[] words = str.split("\\s+");

        // Check if there are at least two words in the sentence
        if (words.length >= 2) {
            String penultimateWord = words[words.length - 2];
            System.out.println("Penultimate Word: " + penultimateWord);
        } else {
            System.out.println("Not enough words to determine penultimate word.");
        }
    }
}
