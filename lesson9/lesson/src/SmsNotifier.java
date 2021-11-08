public class SmsNotifier extends Notifier{
    @Override
    void send(final String message) {
        System.out.println("Send sms: " + message);
    }
}
