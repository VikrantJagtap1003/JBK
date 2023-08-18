package ClassCodes.OtherCodes.Antivirus1;

public class Client {
    private String clientName;
    private Transaction transaction;

    public Client(String clientName, Transaction transaction) {
        this.clientName = clientName;
        this.transaction = transaction;
    }


    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
