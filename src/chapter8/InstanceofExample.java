package chapter8;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus3 bus = new Bus3();

        ride(taxi);
        System.out.println();
        ride(bus);
    }
    public static void ride(Vehicle vehicle) {
        if (vehicle instanceof Bus3 bus) {
            bus.checkFare();
        }
        vehicle.run();
    }
}
