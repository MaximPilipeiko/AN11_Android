import java.util.Arrays;

public class Tree<T> {
    private final T[] fruits;

    public Tree(T... fruits) {
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "fruits=" + Arrays.toString(fruits) +
                '}';
    }
}
