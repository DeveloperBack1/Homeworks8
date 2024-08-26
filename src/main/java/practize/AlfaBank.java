package practize;

public class AlfaBank extends Bank {


    public AlfaBank() {
        super("AlphaBank", 7.5, 10000, 21);
    }

    @Override
    public double calculateMonthlyPayment(int sum, double rate) {
        double result = sum/100*rate/12;
        return result;
    }
    }

