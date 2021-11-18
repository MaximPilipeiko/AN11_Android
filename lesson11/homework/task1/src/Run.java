import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Run {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println(list);

        final ExecutorService executor = Executors.newCachedThreadPool();
        final Future<Integer> maxFuture = executor.submit(new MaxFinder(list));
        final Future<Integer> minFuture = executor.submit(new MinFinder(list));
        executor.shutdown();
//        while (!maxFuture.isDone()) {
//            System.out.println("Wait please");
//        }
        try {
            System.out.println("Min value: " + minFuture.get());
            System.out.println("MAx value: " + maxFuture.get());
        } catch (InterruptedException pE) {
            pE.printStackTrace();
        } catch (ExecutionException pE) {
            pE.printStackTrace();
        }

    }
}
