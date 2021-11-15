import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionUtils {

    public static <T> Set<T> union(Collection<T> ...sets) {
        final Set<T> result = new LinkedHashSet<>();
        for (final Collection<T> set : sets) {
            result.addAll(set);
        }

        return result;
    }

    @SafeVarargs
    public static <T> Set<T> intersect(Set<T> ...sets) {
        if (sets.length == 0)
            return Set.of();

        final Set<T> result = new HashSet<>(sets[0]);
        for (final Set<T> set : sets) {
            result.retainAll(set);
        }

        return result;
    }
}
