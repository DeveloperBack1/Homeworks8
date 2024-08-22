package homework1_2108;


public class Pet {


    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Общие методы для всех домашних животных
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

//  Cat наследуется от Pet
class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, age);
    }

    //  Поведение для кошек
    public void meow() {
        System.out.println(getName() + " says: Meow!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating cat food.");
    }
}

// Класс Dog, наследуется от Pet
class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, age);
    }

    //  Поведение для собак
    public void bark() {
        System.out.println(getName() + " says: Bow Wow!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food.");
    }
}

