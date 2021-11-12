import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final String[] blackList = IOUtils.readLines("/Users/maksimpilipeiko/TMS/AN11_Android/lesson10/homework/task3/resources/black-list.txt");
        final String sourceText = IOUtils.readFile("/Users/maksimpilipeiko/TMS/AN11_Android/lesson10/homework/task3/resources/source.txt");
        final String[] sentences = IOUtils.splitOnSentences(sourceText);
        List<String> badSentences = new ArrayList<>();
        for (final String sentence : sentences) {
            final String[] words = IOUtils.splitOnWords(sentence);
            if (containsAnyIgnoreCase(words, blackList)) {
                badSentences.add(sentence.trim());
            }
        }

        try (var out = new PrintWriter("/Users/maksimpilipeiko/TMS/AN11_Android/lesson10/homework/task3/resources/result.txt")) {
            out.printf("Count of sentences with rejected words: %d\n\n", badSentences.size());
            for (final String badSentence : badSentences) {
                out.println(badSentence);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static boolean containsAnyIgnoreCase(String[] src, String[] checks) {
        for (final String item : src) {
            for (final String check : checks) {
                if (item.equalsIgnoreCase(check)) {
                    return true;
                }
            }
        }

        return false;
    }
}
