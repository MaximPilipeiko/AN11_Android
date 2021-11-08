public class TelegramNotifier extends Notifier{
    @Override
    void send(final String message) {
        System.out.println("Telegram sms: " + message);
    }
}
