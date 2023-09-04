package August_29.ExceptionHandling.AdvanceHotelManagement;

public class HouseKeeping extends Employee {
    public HouseKeeping()
    {

    }

    public HouseKeeping(int employeeId, String employeeName, int age)
    {
        super(employeeId,employeeName,age);
    }

    public void cleanRoom()
    {
        System.out.println(this.getEmployeeName()+" is Cleaning the room");
    }

}
