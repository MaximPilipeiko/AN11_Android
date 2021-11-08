public class Run {
    public static void main(String[] args) {
        final Car tesla = new Car("Tesla", 350, 40000);
        final Car audi = new Car("Audi", 300, 35000);
        final Car honda = new Car("Honda", 230, 8000);

        try {
            tesla.start();
        } catch (StartCarException ex) {
            System.err.printf("Failed to start Car '%s'.\n", tesla.getBrand());
            ex.printStackTrace();
        }

        try {
            audi.start();
        } catch (StartCarException ex) {
            System.err.printf("Failed to start Car '%s'.\n", audi.getBrand());
            ex.printStackTrace();
        }

         try {
             honda.start();
        } catch (StartCarException ex) {
            System.err.printf("Failed to start Car '%s'.\n", audi.getBrand());
            ex.printStackTrace();
        }
    }
}
