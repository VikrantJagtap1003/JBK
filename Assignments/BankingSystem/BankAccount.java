package ClassCodes.OtherCodes.BankingApplication;

public class BankAccount {
    private long accountNumber;
    private double balance;
    private String ownerName;
    public BankAccount(long accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposite(int val)
    {
        balance=balance+val;
        System.out.println("your balance is "+balance);
    }
    public void withdraw(int val)
    {
        if (balance-val>=0)
        {
            balance=balance=val;
            System.out.println("withdraw successfully..");
            System.out.println("your current Ammount is: "+balance);
        }
        else{
            System.out.println("not Sufficient amount to withdraw..");
        }
    }
}
