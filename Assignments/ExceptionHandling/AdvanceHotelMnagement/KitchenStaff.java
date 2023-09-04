package August_29.ExceptionHandling.AdvanceHotelManagement;

public class KitchenStaff extends Employee{

    public KitchenStaff()
    {

    }

    public KitchenStaff(int employeeId, String employeeName, int age)
    {
        super(employeeId,employeeName,age);
    }

    public void cook()
    {
        System.out.println(this.getEmployeeName()+" is cooking the food");
    }
}
