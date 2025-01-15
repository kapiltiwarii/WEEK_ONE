import java.util.Scanner;

public class LongestWordFinder{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        String longestWord = findLongestWord(sentence);
        System.out.println("The longest word is: " + longestWord);
    }
   // Method to find longestWord
    public static String findLongestWord(String sentence) {
        String longestWord = "";
        int maxLength = 0;
        int wordStart = 0;
        int sentenceLength = sentence.length();

        for (int i = 0; i <= sentenceLength; i++) {
            if (i == sentenceLength || sentence.charAt(i) == ' ') {
                int wordEnd = i;
                int wordLength = wordEnd - wordStart;

                if (wordLength > maxLength) {
                    maxLength = wordLength;
                    longestWord = sentence.substring(wordStart, wordEnd);
                }

                wordStart = i + 1;
            }
        }

        return longestWord;
    }
} 
