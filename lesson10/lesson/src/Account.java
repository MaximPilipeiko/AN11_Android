public class Account<ID, SUM> {
    private ID id;
    private SUM sum;

    public Account(final ID pId, final SUM pSum) {
        id = pId;
        sum = pSum;
    }

    public ID getId() {
        return id;
    }

    public SUM getSum() {
        return sum;
    }

    public void setSum(final SUM pSum) {
        sum = pSum;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", sum=" + sum +
                '}';
    }
}
