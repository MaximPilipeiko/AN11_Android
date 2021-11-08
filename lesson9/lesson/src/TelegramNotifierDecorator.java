public class TelegramNotifierDecorator extends BaseNotifierDecorator{
    protected TelegramNotifierDecorator(final Notifier pWrappee) {
        super(pWrappee);
    }

    @Override
    void send(final String message) {
        wrappee.send(message);
        System.out.println("telegram: " + message);
    }
}
