public class Printer {
    public static <Item> void print(Item[] items) {
        for (final Item item : items) {
            System.out.println("Item Info: " + item);
        }
    }
}
