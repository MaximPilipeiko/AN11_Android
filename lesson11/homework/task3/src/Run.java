import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {
    private final static int SENTENCES_ON_THREAD = 100;

    public static void main(String[] args) {
        final String[] blackList = IOUtils.readLines("/Users/maksimpilipeiko/TMS/AN11_Android/lesson11/homework/task3/resources/black-list.txt");
        final String sourceText = IOUtils.readFile("/Users/maksimpilipeiko/TMS/AN11_Android/lesson11/homework/task3/resources/source.txt");
        final String[] sentences = IOUtils.splitOnSentences(sourceText);

        Marker isFoundBadWord = new Marker();
        int threadCount = (int) Math.ceil(sentences.length / (double) SENTENCES_ON_THREAD);
        final List<Thread> threads = new ArrayList<>(threadCount);
        System.out.println("threadCount: " + threadCount);

        for (int i = 0; i < threadCount; i++) {
            final String[] subSentences = i == threadCount - 1 ?
                    Arrays.copyOfRange(sentences, i * SENTENCES_ON_THREAD, sentences.length) :
                    Arrays.copyOfRange(sentences, i * SENTENCES_ON_THREAD, (i + 1) * SENTENCES_ON_THREAD);

            var thread = new Thread(
                    new CensorMarker(
                            isFoundBadWord,
                            subSentences,
                            blackList
                    )
            );
            thread.start();
            threads.add(thread);
        }
        while (!isFoundBadWord.isMarked() && isAnyAlive(threads)) {
            synchronized (isFoundBadWord) {
                try {
                    isFoundBadWord.wait(1000);
                } catch (InterruptedException pE) {
                   System.err.println("Thread has been interrupted");
                }
            }
        }

        System.out.println("Text is " + (isFoundBadWord.isMarked() ? "not ok" : "ok"));

    }

    public static boolean isAnyAlive(List<Thread> threads) {
        for (final Thread thread : threads) {
            if (thread.isAlive()) {
                return true;
            }
        }

        return false;
    }
}
