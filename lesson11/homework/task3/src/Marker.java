public class Marker {
    private Boolean marker = false;

    public synchronized void mark() {
        marker = true;
        notifyAll();
    }

    public Boolean isMarked() {
        return marker;
    }
}
