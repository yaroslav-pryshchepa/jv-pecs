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
    public List<Excavator> get() {
        return List.of(new Excavator(), new Excavator(), new Excavator());
    }
}
