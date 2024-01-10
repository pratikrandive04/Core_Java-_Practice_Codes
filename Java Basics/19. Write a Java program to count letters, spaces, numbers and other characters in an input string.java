// 19. Write a Java program to count letters, spaces, numbers and other characters in an input string.

public class practice {
    public static void main(String args[]) {

        String sentence = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int other = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch >= '0' && ch <= '9') {
                numbers++;
            } else if (ch == ' ') {
                spaces++;
            } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                letters++;
            } else {
                other++;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Numbers: " + numbers);
        System.out.println("Spaces: " + spaces);
        System.out.println("Other characters: " + other);
    }
}
