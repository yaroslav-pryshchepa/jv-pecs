package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.equals(Bulldozer.class)) {
            Bulldozer bulldozer = new Bulldozer();
            List<? extends Machine> machines = bulldozer.get();
            return new ArrayList<>(machines);
        } else if (type.equals(Excavator.class)) {
            Excavator excavator = new Excavator();
            List<? extends Machine> machines = excavator.get();
            return new ArrayList<>(machines);
        } else if (type.equals(Truck.class)) {
            Truck truck = new Truck();
            List<? extends Machine> machines = truck.get();
            return new ArrayList<>(machines);
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
