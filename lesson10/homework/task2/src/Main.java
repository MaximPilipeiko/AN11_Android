import java.util.*;

public class Main {

    public static void main(String[] args) {
//        List<Person> persons = new ArrayList<>();
//        persons.add(new Person("Masha"));
//        persons.add(new Person("Anya"));
//        persons.add(new Person("Dasha"));
//        persons.add(new Person("Sasha"));
//        persons.add(new Person("Nastya"));
//
//        System.out.println(persons);
//        System.out.println(persons.contains(persons.get(2)));
//        persons.remove(new Person("Dasha"));
//        System.out.println(persons);
//        persons.retainAll()


        final String text = IOUtils.readFile("/Users/maksimpilipeiko/TMS/AN11_Android/lesson10/homework/task2/resources/input.txt");
        final String[] words = IOUtils.splitOnWords(text);
        Map<String, Integer> wordsCounter = new HashMap<>(100);
        for (final String _word : words) {
            final String word = _word.toLowerCase();
            Integer count = wordsCounter.get(word);
            if (count == null) {
                count = 0;
            }
            wordsCounter.put(word, count + 1);
        }




        final List<Map.Entry<String, Integer>> sorted = new ArrayList<>(wordsCounter.entrySet());
        Collections.sort(
                sorted,
                (o1, o2) -> o2.getValue() - o1.getValue()
        );

        for (final Map.Entry<String, Integer> word : sorted) {
            System.out.println(word);
        }

        Set<Integer> set1 = Set.of(1, 3, 4, 5, 6, 8, 9);
        Set<Integer> set2 = Set.of(2, 3, 5, 6, 8, 9);
        Set<Integer> set3 = Set.of(2, 3, 4, 5, 6, 7, 9);
        Set<Integer> set4 = Set.of(3, 4, 6, 8, 9, 10);
//        Set<String> set5 = Set.of("3", "4");
        final Set<Integer> result = CollectionUtils.intersect(set1, set2, set3, set4);
//        System.out.println(result);
//        final Set<Integer> integers = new HashSet<>();
//        integers.add(1);
//        integers.add(2);
//        CollectionUtils.union(integers);
    }
}
