package ClassCodes.Organization;

public class Manager extends Employee {
    private String department;
    public Manager(String name,int id,String department)
    {
        super(name,id);
        this.department=department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString()
    {
        return super.toString()+" department Manager of= "+this.department+'}';
    }
}
