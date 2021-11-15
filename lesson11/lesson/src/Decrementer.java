public class Decrementer extends Thread{
    private final Counter counter;

    public Decrementer(final Counter pCounter) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException pE) {
            pE.printStackTrace();
        }
        counter = pCounter;
    }

    @Override
    public void run() {
        counter.decrement();
    }
}
