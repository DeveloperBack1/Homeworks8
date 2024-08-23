package homework2_2108;
public class Zoo {
    public static void main(String[] args) {
        Lion lion = new Lion("Leon", 7);
        Elephant elephant = new Elephant("Gumbo", 12);
        Eagle eagle = new Eagle("Kandy", 4);
        Snake snake = new Snake("Blacky", 5);

        // Вызов методов
        lion.eat();
        lion.roar();
        elephant.graze();
        elephant.trumpet();
        eagle.fly();
        eagle.soar();
        snake.crawl();
        snake.hiss();
    }
}