package abstraction;

public class LaserPrinter extends Printer {
int countPrintPage;

    public LaserPrinter(String name, String model, int year) {
        super();
        System.out.println("Работает конструктор LaserPrinter::LaserPrinter()");

    }


    @Override
    void print() {
        System.out.println("Печатает с помощью лазера и тонера");
    }

    @Override
    void gasstation() {
        System.out.println("Меняется картридж");
    }
}



