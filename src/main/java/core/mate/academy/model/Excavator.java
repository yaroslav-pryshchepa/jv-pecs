package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class Excavator extends Machine implements MachineProducer<Excavator> {
    private int power;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public List<? super Machine> get() {
        Excavator excavator1 = new Excavator();
        Excavator excavator2 = new Excavator();
        Excavator excavator3 = new Excavator();
        return List.of(excavator1, excavator2, excavator3);
    }
}
