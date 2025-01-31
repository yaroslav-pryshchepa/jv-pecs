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
    public List<? super Machine> get() {
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        Truck truck3 = new Truck();
        return List.of(truck1, truck2, truck3);
    }
}
