package ClassCodes.OtherCodes.Antivirus1;

public class Antivirus {
    private final int productKey=12345678;
    private Client client;

    public Antivirus(Client client) {
        this.client = client;
        System.out.println("you are using free version of Antivirus");
    }

    public Antivirus(Client client,int productKey)
    {
        this.client=client;
        if(this.productKey==productKey)
        {
            if(client.getTransaction().getApproved())
            {
                System.out.println("Activated...");
            }
            else {
                System.out.println("Transaction is not done-please pay first to activate  product key");
            }
        }
    }
}
