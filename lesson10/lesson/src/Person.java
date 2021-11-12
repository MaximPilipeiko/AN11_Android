import java.util.Objects;

public class Person implements Comparable<Person> {
    private final String name;

    public Person(final String pName) {
        name = pName;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(final Object pO) {
        if (this == pO) return true;
        if (pO == null || getClass() != pO.getClass()) return false;
        final Person person = (Person) pO;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result = 0;
        for (final char c : name.toCharArray()) {
            result += c;
        }
        return result;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(final Person o) {
        return getName().compareToIgnoreCase(o.getName());
    }
}
