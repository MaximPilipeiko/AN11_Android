import java.util.Objects;

public class Person {
    private String name;

    public Person(final String pName) {
        name = pName;
    }

    public String getName() {
        return name;
    }

    public void setName(final String pName) {
        name = pName;
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
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
