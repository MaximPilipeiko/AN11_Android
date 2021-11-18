import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

public class LockSentences {
    private List<String> sentences = new ArrayList<>();

    private Lock lock = new ReentrantLock();
    public void add(final String sentence) {
        try {
            if (lock.tryLock(1, TimeUnit.SECONDS)) {
                try {
                    sentences.add(sentence);
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Cannot lock");
            }
        } catch (InterruptedException pE) {
            pE.printStackTrace();
        }

    }

    public List<String> getSentences() {
        return sentences;
    }
}
