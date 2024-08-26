package lesson2_Interface1;

public class Airplane implements Flyable, Soundable {
    String name;
    int countPassenger;


    public Airplane(String name, int countPassenger) {
        this.name = name;
        this.countPassenger = countPassenger;
    }

    @Override
    public void fly() {
        System.out.println(name + " fliegt sehr schnell!");
    }


    @Override
    public void makeSound() {
        System.out.println(name + " isdaet silnij zwuk!!!");
    }

    void service() {
        System.out.println(name + " dolshen bitj obslushen");
    }
}