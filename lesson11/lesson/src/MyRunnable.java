public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hey I'm " + Thread.currentThread().getName());
    }
}
