package August_29.BankApplication;

public class BankAccount {
    private long accountNumber;
    private String AccountHolderName;
    private double balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        AccountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }

    public BankAccount()
    {

    }

    public BankAccount(long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        AccountHolderName = accountHolderName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", AccountHolderName='" + AccountHolderName + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void addAmount(double amount)
    {
        this.balance+=amount;
        System.out.println("your current balance="+this.balance);
    }
    public void removeAmount(double amount)
    {
        if(this.balance-amount>=0)
        {
            this.balance-=amount;
        }
        else {
            System.out.println("not sufficient balance");
        }
    }
}
