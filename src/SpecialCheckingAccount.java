public class SpecialCheckingAccount extends CheckingAccount {

    private double minBalance;
    private double interestRate;

    public SpecialCheckingAccount(int id, double bal, double cc, double interest, double minbal)
    {
        super(id, bal, cc);
        minBalance = minbal;
        interestRate = interest;
    }

    public void clearCheck(double amount)
    {
        if(currentBalance() > minBalance)
            { decreaseBalance(amount); }
        else
            { super.clearCheck(amount); }
    }

    public double monthlyInterest()
    {
        if(currentBalance() > minBalance)
            { return currentBalance() * interestRate / 12; }
        else
            { return super.monthlyInterest(); }
    }
}
