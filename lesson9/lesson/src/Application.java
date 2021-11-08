public class Application {
    private final Notifier notifier;

    public Application(final Notifier pNotifier) {
        notifier = pNotifier;
    }

    public void doSmth() {
        //.....
        notifier.send("I'm done");
    }
}
