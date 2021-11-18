import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.*;

public class Run {
    private final static int SENTENCES_ON_THREAD = 100;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        scanner.next();

        final String[] blackList = IOUtils.readLines("/Users/maksimpilipeiko/TMS/AN11_Android/lesson11/homework/task3/resources/black-list.txt");
        final String sourceText = IOUtils.readFile("/Users/maksimpilipeiko/TMS/AN11_Android/lesson11/homework/task3/resources/source.txt");
        final String[] sentences = IOUtils.splitOnSentences(sourceText);

        final long start = System.currentTimeMillis();

        List<String> badSentences = new CopyOnWriteArrayList<>();
        int threadCount = (int) Math.ceil(sentences.length / (double) SENTENCES_ON_THREAD);
        final List<Thread> threads = new ArrayList<>(threadCount);
        System.out.println("threadCount: " + threadCount);

        ExecutorService executor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < threadCount; i++) {
            final String[] subSentences = i == threadCount - 1 ?
                    Arrays.copyOfRange(sentences, i * SENTENCES_ON_THREAD, sentences.length) :
                    Arrays.copyOfRange(sentences, i * SENTENCES_ON_THREAD, (i + 1) * SENTENCES_ON_THREAD);

            final CensorAccumOptim censorAccum = new CensorAccumOptim(
                    badSentences,
                    subSentences,
                    blackList
            );
            executor.execute(censorAccum);
//            thread.setDaemon(true);
//            thread.start();
//            threads.add(thread);
        }

        executor.shutdown();
        try {
            executor.awaitTermination(100, TimeUnit.SECONDS);
        } catch (InterruptedException pE) {
            pE.printStackTrace();
        }

//        while (isAnyAlive(threads)) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException pE) {
//                pE.printStackTrace();
//            }
//        }

        final long finish = System.currentTimeMillis();

        System.out.println("Time spent: " + (finish - start));
        try (var out = new PrintWriter("/Users/maksimpilipeiko/TMS/AN11_Android/lesson11/homework/task3/resources/result.txt")) {
            out.printf("Count of sentences with rejected words: %d\n\n", badSentences.size());
            for (final String badSentence : badSentences) {
                out.println(badSentence);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        scanner.next();
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
