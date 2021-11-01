public class Shuttle implements IStart{
    @Override
    public boolean checkBeforeStart() {
        // todo interesting check
        return (int) (Math.random() * 10) > 3;
    }

    @Override
    public void enginesStart() {
        System.out.println("Двигатели Шатла запущены.\n" +
                "Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
