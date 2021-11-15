package test;

public class Store {
    private int products;

    public Store(final int pProducts) {
        products = pProducts;
    }

    public Store() {
        this(0);
    }

    public synchronized void get() {
        while (products < 1) {
            try {
                System.out.println("Ожидается поступление товара.");
                wait();
            } catch (InterruptedException pE) {
                pE.printStackTrace();
            }
        }
        products--;
        System.out.println("Товар получен.");
        System.out.println("Товаров на складе: " + products);
        notify();
    }

    public synchronized void put() {
        while (products >= 3) {
            try {
                System.out.println("Склад заполнен.");
                wait();
            } catch (InterruptedException pE) {
                pE.printStackTrace();
            }
        }
        products++;
        System.out.println("Товар добавлен.");
        System.out.println("Товаров на складе: " + products);
        notify();
    }
}
