package abstraction;

public class Run {
    public static void main(String[] args) {
        LaserPrinter printer = new LaserPrinter("HP","71S",2011);

        printer.print();
        printer.repair();
        printer.gasstation();

        JetPrinter jetPrinter = new JetPrinter("Epson","JET200",2010);
        jetPrinter.repair();
        jetPrinter.gasstation();
        jetPrinter.print();
    }
}
