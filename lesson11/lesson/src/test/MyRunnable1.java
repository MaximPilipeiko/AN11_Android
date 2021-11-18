package test;

public class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        System.out.println("I'm Runnable and my name is " + Thread.currentThread().getName());
    }
}
