import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class IOUtils {
    public static String[] splitOnWords(final String line) {
        return line.trim().split("\\W+");
    }

    public static String[] splitOnSentences(final String text) {
        return text.split("[.!?]");
    }

    public static String readFile(final String filePath) {
        StringBuilder text = new StringBuilder(1000);
        try (var reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line)
                        .append(" ");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return text.toString();
    }

    public static String[] readLines(final String filePath) {
        String[] lines = new String[2];
        int lineNumber = 0;
        try (var reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (lineNumber == lines.length) {
                    lines = Arrays.copyOf(lines, lines.length * 2);

                }
                lines[lineNumber] = line;
                lineNumber++;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return Arrays.copyOf(lines, lineNumber);
    }
}
