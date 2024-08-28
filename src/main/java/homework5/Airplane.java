package homework5;

public class Airplane implements Repairable, PassengerTransportable, CargoTransportable, Flyable {
    @Override
    public void service() {
        System.out.println("Das Flugzeug wird ständig gewartet!");
    }

    @Override
    public void repair() {
        System.out.println("Das Flugzeug wird regelmäßig repariert werden!");
    }

    @Override
    public void transportationPassengers() {
        System.out.println("Das Flugzeug befördert Passagieren durch die Luft!");
    }

    @Override
    public void transportationCargoes() {
        System.out.println("Das Flugzeug ist mit Fracht beladen!");
    }

    @Override
    public void fly() {
        System.out.println("Das Flugzeug fliegt!!");
    }
}
