package practize;

public class BetaBank extends Bank {
    public BetaBank() {
        super("BetaBank",9.0, 20000,20);
    }

    @Override
    public double calculateMonthlyPayment(int sum, double rate) {
        double result = sum/100*rate/12;
        return result;
    }
    }

