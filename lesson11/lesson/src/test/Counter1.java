package test;

public class Counter1 {
    private Integer count1 = 0;
    private Integer count2 = 0;

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public synchronized static void print() {
        System.out.println("asdasd");
    }

    public synchronized void increment() {
        count1++;
    }

    public synchronized void decrement() {
        count1--;
    }

    public int getCount1() {
        return count1;
    }

    @Override
    public String toString() {
        return "test.Counter1{" +
                "count=" + count1 +
                '}';
    }
}
