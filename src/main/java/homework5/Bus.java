package homework5;

public class Bus implements Repairable, PassengerTransportable, Roadmovable {
    @Override
    public void service() {
        System.out.println("Bus bekommt regelmäßig Service!");
    }

    @Override
    public void repair() {
        System.out.println("Der Bus wird repariert werden!");
    }

    @Override
    public void transportationPassengers() {
        System.out.println("Der Bus befördert planmäßig Passagieren!");
    }

    @Override
    public void movementRoad() {
        System.out.println("Der Bus ist auf den Strassen unterwegs!!");
    }
}
