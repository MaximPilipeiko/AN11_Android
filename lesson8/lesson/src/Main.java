class DivZeroException extends Exception {
    private int value;

    public DivZeroException(final int pValue) {
        value = pValue;
    }

    public int getValue() {
        return value;
    }
}

class DivOneException extends Exception {
}

class CalculateException extends Exception {
    public CalculateException(final Throwable cause) {
        super(cause);
    }
}
public class Main {
    public static int div(int a, int b) throws DivZeroException, DivOneException {
        if (b == 0) {
            final DivZeroException exception = new DivZeroException(b);
            throw exception;
        }
        if (b == 1) {
            final DivOneException exception = new DivOneException();
            throw exception;
        }
        return a / b;
    }

    public static int calculate(int a, int b) throws CalculateException {
        if (b == 0) {
            throw new IllegalArgumentException();
        }


        try {
            return div(a, b);
        } catch (DivZeroException | DivOneException ex) {
            System.out.println("I catch!!!");
            CalculateException exception = new CalculateException(ex);
            throw exception;
        }
    }

    public static void callSwitch(Switch s) throws SwitchException {
        s.action();
    }
    public static void main(String[] args) {
        int result;
        try {
            result = calculate(5, 2);

            System.out.println("HERE!!");
        } catch (ArithmeticException | CalculateException ex) {
            ex.printStackTrace();
            result = 1;
        } finally {
            System.out.println("FINALLY!!!");
        }
//
//        System.out.println(result);

//        final Person person = new Person(1);
//        System.out.println(person.getId());

        final Switch switch1 = new MySwitch();
        try {
            switch1.on();
            return;
//            switch1.action();
        } finally {
            try {
                switch1.off();
            } catch (Exception pE) {
                pE.printStackTrace();
            }
        }

//        System.out.println("State: " + switch1.isOn());

    }
}
