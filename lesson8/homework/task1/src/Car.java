public class Car {
    private String brand;
    private int maxSpeed;
    private double price;

    public Car() {
    }

    public Car(final String pBrand, final int pMaxSpeed, final double pPrice) {
        brand = pBrand;
        maxSpeed = pMaxSpeed;
        price = pPrice;
    }

    public void start() throws StartCarException {
        int random = (int) (Math.random() * 20);
        if (random % 2 == 0) {
            throw new StartCarException("Ups, somethings was wrong.");
        }

        System.out.printf("Car '%s' has been started!\n", brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String pBrand) {
        brand = pBrand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(final int pMaxSpeed) {
        maxSpeed = pMaxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double pPrice) {
        price = pPrice;
    }
}
