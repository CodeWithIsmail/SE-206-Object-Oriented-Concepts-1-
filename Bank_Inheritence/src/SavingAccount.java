public class SavingAccount extends CheckingAccount{
    private final double interestRate;
    private static final int MAX_WITHDRAWAL=5;
    private int withdrawalCount;

    public SavingAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest()
    {
        return getBalance()*interestRate/100;
    }

    @Override
    public void withdraw(double amount) {
        if(withdrawalCount<MAX_WITHDRAWAL)
        {
            super.withdraw(amount);
            withdrawalCount++;
        }
        else
        {
            System.out.println("Withdrawal limit exceed");
        }

    }
}
