package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class Truck extends Machine implements MachineProducer<Truck> {
    private int weight;

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public List<Truck> get() {
        return List.of(new Truck(), new Truck(), new Truck());
    }
}
