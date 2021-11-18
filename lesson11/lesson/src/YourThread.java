public class YourThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start");
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}
