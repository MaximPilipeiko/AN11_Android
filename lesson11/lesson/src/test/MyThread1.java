package test;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException pE) {
            pE.printStackTrace();
        }
        System.out.println("My name is " +  Thread.currentThread().getName());
    }
}
