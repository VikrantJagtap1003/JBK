package August_29.EmployeeManagement;

public class Main {

    public static void main(String[] args) {
        Employee emp1=new Employee(1,"Vikrant","Devloper");
        Employee emp2=new Employee(2,"Rushi","UI Designer");
        Employee emp3=new Employee(3,"Harshwardhan","Devloper");
        EmployeeHandler employeeHandler=new EmployeeHandler();
        employeeHandler.addEmployee(emp1);
        employeeHandler.addEmployee(emp2);
        employeeHandler.addEmployee(emp3);

        //employeeHandler.showEmloyeeDetais();
        employeeHandler.searchEmployeeByID(2);
    }
}
