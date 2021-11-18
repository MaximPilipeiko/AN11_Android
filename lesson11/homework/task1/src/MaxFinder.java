import java.util.List;
import java.util.concurrent.Callable;

public class MaxFinder implements Callable<Integer> {
    private final List<Integer> list;

    public MaxFinder(final List<Integer> pList) {
        list = pList;
    }

    @Override
    public Integer call() {
        if (list == null || list.isEmpty()) {
            return null;
        }


        Integer max = list.get(0);
        for (Integer item : list) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException pE) {
                pE.printStackTrace();
            }
            if (item > max) {
                max = item;
            }
        }

        return max;
    }
}
