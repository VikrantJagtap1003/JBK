package ClassCodes.Organization;

public class Main {
    public static void main(String[] args) {
        Employee manager=new Manager("Vikrant",1,"Developing");
        System.out.println(manager);
        Employee developer=new Developer("Rushi",2,"ReactJs");
        System.out.println(developer);
    }
}
