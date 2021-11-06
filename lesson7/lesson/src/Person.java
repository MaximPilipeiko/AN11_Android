import java.util.Objects;

public class Person {
    public final int id;
    private final String name;

    public Person(final int pId, final String pName) {
        id = pId;
        name = pName;
    }

    public Person updateName(String name) {
        final Person newPerson = new Person(
                this.id, name
        );
        return newPerson;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + "'" +
                "}";
    }
}
