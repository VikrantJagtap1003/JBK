package August_29.EmployeeManagement;

public class Employee  implements FinzlyCompany {
    private int employeeId;
    private String employeeName;
    private String section;

    public Employee()
    {

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", section='" + section + '\'' +
                '}';
    }

    public Employee(int employeeId, String employeeName, String section) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.section = section;
    }
}
