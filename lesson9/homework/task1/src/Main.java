import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        final String[] sourceWords = IOUtils.readLines("/Users/maksimpilipeiko/TMS/AN11_Android/lesson10/homework/task1/resources/input.txt");
        try (var writer = new PrintWriter("/Users/maksimpilipeiko/TMS/AN11_Android/lesson10/homework/task1/resources/output.txt")) {
            for (String word: sourceWords) {
                if (isPalindrome(word)) {
                    writer.println(word);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }

    private static boolean isPalindrome(String word) {
        final String reversedWord = new StringBuilder(word).reverse().toString();
        return word.equals(reversedWord);
    }
}
