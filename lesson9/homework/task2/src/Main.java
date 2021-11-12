import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        final String sourceText = IOUtils.readFile("/Users/maksimpilipeiko/TMS/AN11_Android/lesson10/homework/task2/resources/input.txt");
        final String[] sentences = TextFormatter.splitOnSentences(sourceText);
        try (var writer = new PrintWriter("/Users/maksimpilipeiko/TMS/AN11_Android/lesson10/homework/task2/resources/output.txt")) {
            for (final String sentence : sentences) {
                if (sentence.isBlank()) continue;

                final int wordsCount = TextFormatter.calculateWordsCount(sentence);
                final boolean hasPalindrome = TextFormatter.hasPalindrome(sentence);
                if ((wordsCount >= 3 && wordsCount <= 5) || hasPalindrome) {
                    writer.println(sentence.trim());
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
