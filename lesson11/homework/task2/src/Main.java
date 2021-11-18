public class Main {
    public static void main(String[] args) {
        Object monitor = new Object();
        new Thread(new Chronometer(monitor)).start();
        new Thread(new FiveCounterNotifier(monitor)).start();
        new Thread(new SevenCounterNotifier(monitor)).start();
    }
}
