package java_advanced.day14.interfaceEx;

import java.util.ArrayList;
import java.util.List;

public class User {

    public static void main(String[] args) {

        Vehicle vehicle = new Bus();

        vehicle.run();
//        vehicle.checkFare();
        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(bus);

    }
}
