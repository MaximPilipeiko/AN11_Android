
public class Cosmodrome {
    // todo IStart as parametr
    public void start(IStart start) {
        if (!start.checkBeforeStart()){
            System.out.println(start.getClass().toString() + " - предстартовая проверка провалена");
        } else {
            start.enginesStart();
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
            }
            start.start();
        }
    }
}
