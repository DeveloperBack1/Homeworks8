package practize;

public abstract class Bank {
    String name;
    double rate;
    int maxSum;
    int minClientAge;

    public Bank(String name, double rate, int maxSum, int minClientAge) {
        this.name = name;
        this.rate = rate;
        this.maxSum = maxSum;
        this.minClientAge= minClientAge;
    }

    public boolean checkAge(int age) {
        return (age>= minClientAge);
    }

    public boolean checkSum(int sum) {
        return (sum <= maxSum);
    }

    public abstract double calculateMonthlyPayment(int sum, double rate);

    public void printAllInfo(){
        System.out.println("Name von Bank: " + name+ "\n"+ "Prozentnaja stavka"+ rate+
            "Max summe von Kredite: "+maxSum+ "Minimum Alter von Kunde: "+minClientAge);
    }

}
