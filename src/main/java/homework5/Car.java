package homework5;

public class Car implements Repairable, PassengerTransportable, Roadmovable {
    @Override
    public void service() {
        System.out.println("Das Auto bekommt regelmäßig Service!");
    }

    @Override
    public void repair() {
        System.out.println("Das Auto wird repariert werden!");
    }

    @Override
    public void transportationPassengers() {
        System.out.println("Das Auto befördert regelmäßig Passagieren!");
    }

    @Override
    public void movementRoad() {
        System.out.println("Das Auto ist auf den Strassen unterwegs!");
    }
}
