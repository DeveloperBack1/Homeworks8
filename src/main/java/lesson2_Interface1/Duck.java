package lesson2_Interface1;

public class Duck implements Flyable, Soundable, SwimDiveable{
    @Override
    public void fly() {
        System.out.println("Letaet kak vse!!!");
    }

    @Override
    public void makeSound() {
        System.out.println("Krjakaet");
    }

    @Override
    public void swim() {
        System.out.println("S pomoschju lapok");
    }

//    @Override
//    public void dive() {
//        System.out.println("njirjaet, uhodja pod vodu");
//    }
}
