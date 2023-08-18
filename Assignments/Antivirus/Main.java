package ClassCodes.OtherCodes.Antivirus1;

public class Main {
    public static void main(String[] args) {
        Transaction transaction1=new Transaction(true);
        Client c1=new Client("Vikrant",transaction1);
        Antivirus anti1=new Antivirus(c1,12345678);
    }
}
