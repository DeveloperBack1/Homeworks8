package homework1_2108;



public class Run {
    public static void main(String[] args) {
        Cat cat = new Cat("Bob", 3);
        Dog dog = new Dog("Jack", 5);

        // Вызов общих методов
        cat.eat();
        cat.sleep();
        cat.meow();  // поведение для кошек

        dog.eat();
        dog.sleep();
        dog.bark();  // поведение для собак
    }
}