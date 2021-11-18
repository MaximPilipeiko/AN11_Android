public class SevenCounterNotifier implements Runnable {
    private final Object notifier;
    private int counter = 0;

    public SevenCounterNotifier(final Object pSecondNotifier) {
        notifier = pSecondNotifier;
    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (notifier) {
                    notifier.wait();
                }
            } catch (InterruptedException pE) {
                pE.printStackTrace();
            }
            counter++;
            if (counter == 7) {
                System.out.println("7 секунд истекло");
            } else if (counter % 7 == 0) {
                System.out.println("еще 7 секунд истекло");
            }
        }
    }
}
