public class CheckingAccount {
    private final String accountNumber;
    private double balance;

    public CheckingAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount)
    {
        this.balance+=amount;
        System.out.println("Depositin "+amount+" into account "+accountNumber);
        System.out.println("New balance: "+this.balance);
    }

    public void withdraw(double amount)
    {
        if(amount>this.balance)
        {
            System.out.println("Not enough balance. Current balance: "+this.balance);
        }
        else
        {
            System.out.println("Withdrawing "+amount+" from account "+accountNumber);
            this.balance-=amount;
            System.out.println("New balance: "+this.balance);
        }
    }


}
