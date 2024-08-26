package homework5;

public class MainTransport {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.movementRoad();
        bus.repair();
        bus.service();
        bus.transportationPassengers();
        System.out.println("_________________");

        Car car = new Car();
        car.movementRoad();
        car.repair();
        car.service();
        car.transportationPassengers();
        System.out.println("_________________");

        Truck truck = new Truck();
        truck.movementRoad();
        truck.repair();
        truck.service();
        truck.transportationCargoes();
        System.out.println("_________________");

        Ship ship = new Ship();
        ship.swim();
        ship.service();
        ship.transportationCargoes();
        ship.repair();
        System.out.println("_________________");

        Airplane airplane = new Airplane();
        airplane.transportationPassengers();
        airplane.repair();
        airplane.service();
        airplane.transportationCargoes();
        airplane.fly();
    }
}
