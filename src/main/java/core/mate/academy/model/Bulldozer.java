package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class Bulldozer extends Machine implements MachineProducer<Bulldozer> {
    private int size;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public List<? super Machine> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        Bulldozer bulldozer2 = new Bulldozer();
        Bulldozer bulldozer3 = new Bulldozer();
        return List.of(bulldozer1, bulldozer2, bulldozer3);
    }
}
