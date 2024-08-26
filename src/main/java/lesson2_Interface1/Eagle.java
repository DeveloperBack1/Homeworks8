package lesson2_Interface1;

import homework2_2108.Animal;

public class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println(name+ " fliegt wie Adler");
    }

    @Override
    public void makeSound() {
        System.out.println(name +" macht Geräusche");
    }
}
