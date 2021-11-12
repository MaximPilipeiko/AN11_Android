import java.util.*;

public class Run {
    public static <Item, Value> Value print(Item[] items, Value value) {
        for (final Item item : items) {
            System.out.println("Item: " + item + value);
        }

        return value;

    }

    public static void main(String[] args) {
        Account<Integer, Integer> account1 = new Account<>(1, 1000);
        Account<String, Double> account2 = new Account<String, Double>("1", 1000.0);
        final String id = account2.getId();

//        print(new String[] { "Bob", "Jack", "Sara" });
//        print(new Integer[] { 1, 2, 3 }, true);

//        List<String> list1 = new LinkedList<String>();
//        System.out.println(list1.size());
//        list1.add("Bob");
//        list1.add("Jack");
//        list1.add("Sara");
//        System.out.println(list1.size());
//        System.out.println(list1);
//        System.out.println(list1.contains("Sara"));
//        System.out.println(list1.indexOf("Sara"));
//        list1.remove("Jack");
//        System.out.println(list1);
//        list1.remove(1);
//        System.out.println(list1);
//        System.out.println(list1.contains("Sara"));

//        final Set<String> set = new HashSet<>(100);
//        final String bob1 = new String("Bob");
//        final String bob2 = new String("Bob");
//        set.add(bob1);
//        set.add(bob2);
//        System.out.println(set);
//        System.out.println(bob1.hashCode() == bob2.hashCode());

//        final Set<Person> persons = new HashSet<>(100);
//        final Person bob1 = new Person("Bob");
//        final Person bob2 = new Person("Bob");
//        persons.add(bob1);
//        persons.add(bob2);
//        System.out.println(persons);
//        System.out.println(bob1.hashCode() == bob2.hashCode());

//        final List<Person> persons = new ArrayList<>(100);
//        final Person bob1 = new Person("Bob");
//        final Person bob2 = new Person("Bob");
//        persons.add(bob1);
//        persons.add(bob2);
//        System.out.println(persons);
//        Person bob3 = new Person("Bob");
//        System.out.println(persons.remove(bob3));
//        System.out.println(persons);
//        System.out.println(bob1.hashCode() == bob2.hashCode());
//        Set<Person> persons = new TreeSet<Person>();
//        final Person bob1 = new Person("Bob");
//        final Person sara = new Person("Sara");
//        persons.add(sara);
//        persons.add(bob1);
//        System.out.println(persons);

        final Map<Person, String> map = new HashMap<>();
        final Person bob1 = new Person("Bob");
        final Person bob2 = new Person("Bob");
        final Person sara = new Person("Sara");
        map.put(bob1, bob1.getName());
        map.put(bob2, bob2.getName());
        map.put(sara, sara.getName());
        System.out.println(map);
//        final Person person = map.get(sara.getName());
//        System.out.println(person);


//        final Set<String> set = new TreeSet<>();
//        final String bob1 = new String("Bob");
//        final String sara = new String("Sara");
//        set.add(bob1);
//        set.add(sara);
//        System.out.println(set);


    }
}
