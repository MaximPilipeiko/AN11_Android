import java.io.*;
import java.util.Arrays;

public class IOUtils {
    public static String[] readLines(final String filePath) {
        String[] lines = new String[2];
        int lineNumber = 0;
        try (var reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            while (line != null) {
                if (lineNumber == lines.length) {
                    System.out.println("x2 count lines");
                    lines = Arrays.copyOf(lines, lines.length * 2);

                }
                lines[lineNumber] = line;
                lineNumber++;
                line = reader.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return Arrays.copyOf(lines, lineNumber);
    }

    public static void writeLines(final String filePath, final String[] lines) {
        try (PrintWriter writer = new PrintWriter(filePath)) {
            for (final String line : lines) {
                writer.println(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
