public class FiveCounterNotifier implements Runnable {
    private final Object notifier;
    private int counter = 0;

    public FiveCounterNotifier(final Object pSecondNotifier) {
        notifier = pSecondNotifier;
    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (notifier) {
                    notifier.wait(1000);
                }
            } catch (InterruptedException pE) {
                pE.printStackTrace();
            }
            counter++;
            if (counter == 5) {
                System.out.println("5 секунд истекло");
            } else if (counter % 5 == 0) {
                System.out.println("еще 5 секунд истекло");
            }
        }
    }
}
