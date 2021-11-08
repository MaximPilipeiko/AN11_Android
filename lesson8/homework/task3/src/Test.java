import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class Test {
    public static void test() throws FileNotFoundException, URISyntaxException, NullPointerException, ArithmeticException {
        throw new URISyntaxException("", "");
    }

    public static void main(String[] args) throws URISyntaxException {
        try {
            test();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("FileNotFoundException has been caught");
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            System.out.println("NullPointerException has been caught");
        }
    }
}
