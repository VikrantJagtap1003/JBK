package August_29.BankApplication;

import java.util.HashMap;
import java.util.Map;

public class ManageBankAccounts {
   private static Map<Long,BankAccount> CustomerBankDetails=new HashMap<>();

   public ManageBankAccounts()
   {

   }

   public void createAccount(long accountNumber, String accountHolderName, double balance)
   {
       BankAccount bankAccount=new BankAccount(accountNumber,accountHolderName,balance);
       CustomerBankDetails.put(accountNumber,bankAccount);
   }

   public void depositeAmount(long accountNumber,double balance)
   {
       BankAccount account=ManageBankAccounts.CustomerBankDetails.get(accountNumber);
       account.addAmount(balance);
   }

   public void withdrawAmount(long accountNumber,double balance)
   {
       BankAccount account=ManageBankAccounts.CustomerBankDetails.get(accountNumber);
       account.removeAmount(balance);
   }

   public void checkBalance(long accountNumber)
   {
       BankAccount account=ManageBankAccounts.CustomerBankDetails.get(accountNumber);
       System.out.println("your current balance is="+account.getBalance());
   }
}
