public class Run {
    public static void main(String[] args) {
//        final Thread threadRunnable = new Thread(new MyRunnable());
//        threadRunnable.start();
        System.out.println(Thread.currentThread().getName() + " start");

        MyThread thread1 = new MyThread("MY Thread");
        thread1.setDaemon(true);
        System.out.println(thread1.getName() + " is daemon " + thread1.isDaemon());
        thread1.start();
        YourThread thread2 = new YourThread();
        thread2.start();

        System.out.println(Thread.currentThread().getName() + " finished");

//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException pE) {
//            pE.printStackTrace();
//        }

//        for (int i = 0; i < 100; i++) {
//            final Counter counter = new Counter();
////            System.out.println(counter);
//            final Incrementer incrementer = new Incrementer(counter);
//            final Decrementer decrementer = new Decrementer(counter);
//
//            incrementer.start();
//            decrementer.start();
//
//            try {
//                incrementer.join();
//                decrementer.join();
//            } catch (InterruptedException pE) {
//                pE.printStackTrace();
//            }
//            System.out.println(counter);
//        }
    }
}
