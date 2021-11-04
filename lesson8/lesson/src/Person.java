public class Person {
    private int id;

    public Person(final int pId) {
        if (pId < 0) {
            throw new RuntimeException("no negative");
        }
        id = pId;
    }

    public int getId() {
        return id;
    }
}
