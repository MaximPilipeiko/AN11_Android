import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    private final static int SENTENCES_ON_THREAD = 100;
    public static void main(String[] args) {
//        final Scanner scanner = new Scanner(System.in);
//        scanner.next();

        final String[] blackList = IOUtils.readLines("/Users/maksimpilipeiko/TMS/AN11_Android/lesson11/homework/task3/resources/black-list.txt");
        final String sourceText = IOUtils.readFile("/Users/maksimpilipeiko/TMS/AN11_Android/lesson11/homework/task3/resources/source.txt");
        final String[] sentences = IOUtils.splitOnSentences(sourceText);


        final long start = System.currentTimeMillis();
//        Marker isFoundBadWord = new Marker();
        int threadCount = (int) Math.ceil(sentences.length / (double) SENTENCES_ON_THREAD);
        final List<Thread> threads = new ArrayList<>(threadCount);
        System.out.println("threadCount: " + threadCount);
//        SyncSentences badSentences = new SyncSentences();
        LockSentences badSentences = new LockSentences();
//        List<String> badSentences = Collections.synchronizedList(new ArrayList<>());
//        List<String> badSentences = new CopyOnWriteArrayList<>();

        final ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < threadCount; i++) {
            final String[] subSentences = i == threadCount - 1 ?
                    Arrays.copyOfRange(sentences, i * SENTENCES_ON_THREAD, sentences.length) :
                    Arrays.copyOfRange(sentences, i * SENTENCES_ON_THREAD, (i + 1) * SENTENCES_ON_THREAD);

//            var thread = new Thread(
//                    new CensorMarker(
//                            isFoundBadWord,
//                            subSentences,
//                            blackList
//                    )
//            );
//            thread.setDaemon(true);
//            var thread = new Thread(
//                    new CensorAccum(
//                            badSentences,
//                            subSentences,
//                            blackList
//                    )
//            );
//            executorService.execute(
//                    new CensorAccum(
//                            badSentences,
//                            subSentences,
//                            blackList
//                    )
//            );
//            var thread = new Thread(
//                    new CensorAccumOptim(
//                            badSentences,
//                            subSentences,
//                            blackList
//                    )
//            );
//            thread.start();
//            threads.add(thread);
        }
//        while (!isFoundBadWord.isMarked() && isAnyAlive(threads)) {
//            synchronized (isFoundBadWord) {
//                try {
//                    isFoundBadWord.wait(1000);
//                } catch (InterruptedException pE) {
//                   System.err.println("Thread has been interrupted");
//                }
//            }
//        }

        executorService.shutdown();

        try {
            executorService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException pE) {
            pE.printStackTrace();
        }

//        for (final Thread thread : threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException pE) {
//                pE.printStackTrace();
//            }
//        }

//        System.out.println("Test is " + (isFoundBadWord.isMarked() ? "not ok" : "ok"));

        final long finish = System.currentTimeMillis();

        System.out.println("Spend time in millis: " + (finish - start));

//        try (var out = new PrintWriter("/Users/maksimpilipeiko/TMS/AN11_Android/lesson11/homework/task3/resources/result.txt")) {
//            out.printf("Count of sentences with rejected words: %d\n\n", badSentences.size());
//            for (final String badSentence : badSentences) {
//                out.println(badSentence);
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }

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
