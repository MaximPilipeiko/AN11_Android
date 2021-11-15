public class MyThread extends Thread {
    public MyThread(final String pName) {
        super(pName);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException pE) {
            pE.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " RUN!!!!");
        System.out.println(Thread.currentThread().getName() + " finished");
    }


}
