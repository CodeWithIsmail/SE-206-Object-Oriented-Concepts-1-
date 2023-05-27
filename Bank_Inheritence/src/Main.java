public class Main {
    public static void main(String[] args)
    {
        CheckingAccount account=new CheckingAccount("123456",123.90);
        System.out.println(account.getBalance());
        account.deposit(1000);
        account.withdraw(2000);
        account.withdraw(100);

        SavingAccount account1=new SavingAccount("124",1234,5);
        System.out.println(account1.getBalance());
        System.out.println(account1.calculateInterest());
        account1.withdraw(124);
    }
}