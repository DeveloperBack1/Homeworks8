package lesson2_Interface1;

public abstract class Bird {
    String name;
    String color;



   public void eat(){
       System.out.println("Vogel frisst mit Schnabel");
   }

   public abstract void fly();

   public abstract void makeSound();

}
