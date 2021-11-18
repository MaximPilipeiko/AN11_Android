public class Chronometer implements Runnable {
    private final Object secondNotifier;

    public Chronometer(final Object pSecondNotifier) {
        secondNotifier = pSecondNotifier;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException pE) {
                pE.printStackTrace();
            }
            synchronized (secondNotifier) {
                secondNotifier.notifyAll();
            }
        }
    }
}
