package test;

public class Incrementer1 implements Runnable {
    private final Counter1 counter1;

    public Incrementer1(final Counter1 pCounter1) {
        counter1 = pCounter1;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException pE) {
            pE.printStackTrace();
        }

        counter1.increment();
    }
}
