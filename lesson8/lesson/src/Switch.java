public abstract class Switch {
    boolean isOn = false;
    public void on() {
        System.out.println("ON");
        isOn = true;
    }

    public void off() {
        System.out.println("OFF");
        isOn = false;
    }

    public abstract void action() throws SwitchException;
//        throw new SwitchException();

//        for (int i = 0; i < 10; i++) {
//            System.out.println("Work...");
//        }
//    }

    public boolean isOn() {
        return isOn;
    }
}
