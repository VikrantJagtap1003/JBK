package August_29.ExceptionHandling.AdvanceHotelManagement;

public class FrontDesk extends Employee{

    public FrontDesk()
    {

    }

    public FrontDesk(int employeeId, String employeeName, int age)
    {
        super(employeeId,employeeName,age);
    }

    public void checkInGuest()
    {
        System.out.println("Checking for Guest");
    }

}
