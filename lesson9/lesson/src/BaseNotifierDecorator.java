public abstract class BaseNotifierDecorator extends Notifier {
    protected final Notifier wrappee;

    protected BaseNotifierDecorator(final Notifier pWrappee) {
        wrappee = pWrappee;
    }
}
