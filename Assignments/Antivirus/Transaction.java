package ClassCodes.OtherCodes.Antivirus1;

public class Transaction {
    private boolean approved=false;

    public Transaction(boolean isApproved)
    {
       this.approved=isApproved;
    }
    public boolean getApproved()
    {
        return this.approved;
    }
}
