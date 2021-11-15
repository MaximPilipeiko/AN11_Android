public class Incrementer extends Thread{
    private final Counter counter;

    public Incrementer(final Counter pCounter) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException pE) {
            pE.printStackTrace();
        }
        counter = pCounter;
    }

    @Override
    public void run() {
        counter.increment();
    }
}
