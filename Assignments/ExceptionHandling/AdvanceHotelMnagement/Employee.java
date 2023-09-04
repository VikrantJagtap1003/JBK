package August_29.ExceptionHandling.AdvanceHotelManagement;

public class Employee {

    private int employeeId;
    private String EmployeeName;

    public Employee(int employeeId, String employeeName, int age) {
        this.employeeId = employeeId;
        EmployeeName = employeeName;
        this.age = age;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee()
    {

    }

    private int age;


}
