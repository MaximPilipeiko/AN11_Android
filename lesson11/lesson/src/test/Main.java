package test;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        final Thread currentThread = Thread.currentThread();
//        System.out.println(currentThread.getName() + " started");
//
//        final MyThread1 myThread1 = new MyThread1();
////        myThread1.setDaemon(true);
////        System.out.println(myThread1.isDaemon());
//
//        myThread1.start();
//
//        final Thread threadRunnable = new Thread(new MyRunnable1());
//        threadRunnable.start();
//
//        myThread1.join();
//        threadRunnable.join();
//
//
//        System.out.println(currentThread.getName() + " finished");

//        for (int i = 0; i < 100; i++) {
//            test.Counter1 counter = new test.Counter1();
//            var incrementer = new Thread(new test.Incrementer1(counter));
//            var decrementer = new Thread(new test.Decrementer1(counter));
//            incrementer.start();
//            decrementer.start();
//            incrementer.join();
//            decrementer.join();
//            System.out.println(counter);
//        }

//        final test.Friend alphonse =
//                new test.Friend("Alphonse");
//        final test.Friend gaston =
//                new test.Friend("Gaston");
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                // System.out.println("Thread 1");
//                alphonse.bow(gaston);
//                // System.out.println("Th: gaston bowed to alphonse");
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                //  System.out.println("Thread 2");
//                gaston.bow(alphonse);
//                //  System.out.println("2.gaston waiting alph bowed");
//            }
//        }).start();

        final test.Store store = new test.Store();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    store.get();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    store.put();
                }
            }
        }).start();


    }
}
