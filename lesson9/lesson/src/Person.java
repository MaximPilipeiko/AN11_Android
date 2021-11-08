import java.io.Serializable;

public class Person implements Serializable {
    private long id;
    private String name;
    private transient Account account;

    public class Account implements Serializable {
        private String number;

        public Account(final String pNumber) {
            number = pNumber;
        }

        public String getNumber() {
            return number;
        }
    }

    public Person(final long pId, final String pName, String pAccountNumber) {
        id = pId;
        name = pName;
        account = new Account(pAccountNumber);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account='" + account + '\'' +
                '}';
    }
}
