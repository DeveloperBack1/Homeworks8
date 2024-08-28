package homework5;

public class Truck implements Repairable, CargoTransportable, Roadmovable {
    @Override
    public void service() {
        System.out.println("Der LKW bekommt regelmäßig Service!");
    }

    @Override
    public void repair() {
        System.out.println("Der LKW wird repariert werden!");
    }

    @Override
    public void movementRoad() {
        System.out.println("Der LKW ist auf den Strassen unterwegs!");
    }

    @Override
    public void transportationCargoes() {
        System.out.println("Der LKW befördert regelmäßig Lasten!");

    }
}
