package abstraction;

public abstract class Printer {
    String name;
    String model;
    int year;

    public Printer(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public Printer() {

    }

    void repair(){
        System.out.println("Muss repariert werden");
    }

    void service(){
        System.out.println("Muss Servicemaster rufen");
    }

    abstract void print();


   abstract void gasstation();
}
