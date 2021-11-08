public class SmsNotifierDecorator extends BaseNotifierDecorator{
    protected SmsNotifierDecorator(final Notifier pWrappee) {
        super(pWrappee);
    }

    @Override
    void send(final String message) {
        wrappee.send(message);
        System.out.println("SMS: " + message);
    }
}
