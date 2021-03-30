
public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(int id, double startbal, double interest)
    {
        super(id, startbal);
        interestRate = interest;
    }
    public void withdraw(double money)
    {
        if(money <= currentBalance())
            decreaseBalance(money);
        else
            System.out.println("Insufficient Funds");
    }
    public double monthlyInterest()
    {
        return currentBalance() * interestRate / 12;
    }
}
