package homework5;

public class Ship implements Repairable, CargoTransportable, Swimmable{
    @Override
    public void service() {
        System.out.println("Das Schiff bekommt regelmäßig Service!");
    }

    @Override
    public void repair() {
        System.out.println("Das Schiff  wird repariert werden!");
    }


    @Override
    public void transportationCargoes() {
        System.out.println("Das Schiff befördert regelmäßig Lasten!");
    }

    @Override
    public void swim() {
        System.out.println("Das Schiff fährt!!!");
    }
}
