import java.util.List;
import java.util.concurrent.Callable;

public class MinFinder implements Callable<Integer> {
    private final List<Integer> list;

    public MinFinder(final List<Integer> pList) {
        list = pList;
    }

    @Override
    public Integer call() {
        if (list == null || list.isEmpty()) {
            return null;
        }

        Integer min = list.get(0);
        for (Integer item : list) {
            if (item < min) {
                min = item;
            }
        }

        return min;
    }
}
