import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOUtils {
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
}
