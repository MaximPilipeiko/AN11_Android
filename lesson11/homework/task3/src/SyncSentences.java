import java.util.ArrayList;
import java.util.List;

public class SyncSentences {
    private final List<String> sentences = new ArrayList<>();

    public synchronized void add(String sentence) {
        sentences.add(sentence);
    }

    public List<String> getSentences() {
        return sentences;
    }
}
