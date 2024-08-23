
package homework2_2108;


public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Класс Mammal (Млекопитающие)
class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    public void nurse() {
        System.out.println(getName() + " is nursing its young.");
    }
}

// Класс Carnivore (Плотоядные)
class Carnivore extends Mammal {
    public Carnivore(String name, int age) {
        super(name, age);
    }

    public void hunt() {
        System.out.println(getName() + " is hunting.");
    }
}

// Класс Lion (Лев)
class Lion extends Carnivore {
    public Lion(String name, int age) {
        super(name, age);
    }

    public void roar() {
        System.out.println(getName() + " is roaring!");
    }
}

// Класс Herbivore (Травоядные)
class Herbivore extends Mammal {
    public Herbivore(String name, int age) {
        super(name, age);
    }

    public void graze() {
        System.out.println(getName() + " is grazing.");
    }
}

// Класс Elephant (Слон)
class Elephant extends Herbivore {
    public Elephant(String name, int age) {
        super(name, age);
    }

    public void trumpet() {
        System.out.println(getName() + " is trumpeting!");
    }
}

// Класс Bird (Птицы)
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    public void layEggs() {
        System.out.println(getName() + " is laying eggs.");
    }
}

// Класс FlyingBird (Летающие птицы)
class FlyingBird extends Bird {
    public FlyingBird(String name, int age) {
        super(name, age);
    }

    public void fly() {
        System.out.println(getName() + " is flying.");
    }
}

// Класс Eagle (Орел)
class Eagle extends FlyingBird {
    public Eagle(String name, int age) {
        super(name, age);
    }

    public void soar() {
        System.out.println(getName() + " is soaring high in the sky.");
    }
}

// Класс Reptile (Рептилии)
class Reptile extends Animal {
    public Reptile(String name, int age) {
        super(name, age);
    }

    public void crawl() {
        System.out.println(getName() + " is crawling.");
    }
}

// Класс Snake (Змеи)
class Snake extends Reptile {
    public Snake(String name, int age) {
        super(name, age);
    }

    public void hiss() {
        System.out.println(getName() + " is hissing.");
    }
}
