package August_29.ExceptionHandling.AdvanceHotelManagement;

public class Maintenance extends Employee{
    public Maintenance()
    {

    }

    public Maintenance(int employeeId, String employeeName, int age)
    {
        super(employeeId,employeeName,age);
    }

    public void maintain()
    {
        System.out.println(this.getEmployeeName()+" is maintainig the room");
    }
}
