package ClassCodes.OtherCodes.BankingApplication;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount(112343176524L,2000,"Vikrant");
        bankAccount.withdraw(3000);
        bankAccount.deposite(4000);
        bankAccount.withdraw(4000);

    }
}
