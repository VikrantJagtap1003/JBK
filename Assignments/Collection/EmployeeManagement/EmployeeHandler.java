package August_29.EmployeeManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeHandler {
    private static Map<Integer,Employee> employees=new HashMap<>();

    public EmployeeHandler()
    {

    }

    public int addEmployee(Employee employee)
    {
        int count=0;
        if(employee instanceof FinzlyCompany)
        {
            employees.put(employee.getEmployeeId(),employee);
            count++;
        }
        else{
            System.out.println(employee.getEmployeeName()+" bhai tu kaha kam karta hai ?");
        }

        return count;
    }

    public int addEmployees(Set<Employee> emplist)
    {
        int count=0;
        for(Employee employee:emplist)
        {
            if(employee instanceof FinzlyCompany)
            {
                EmployeeHandler.employees.put(employee.getEmployeeId(),employee);
                count++;
            }
            else{
                System.out.println(employee.getEmployeeId()+" "+employee.getEmployeeName()+" is not in this Company");
            }
        }
        return count;
    }

    public void searchEmployeeByID(int employeeId)
    {
        Employee searchedEmployee=null;
        for( Integer tempEmployee_id:EmployeeHandler.employees.keySet())
        {
            if(tempEmployee_id==employeeId)
            {
                searchedEmployee=EmployeeHandler.employees.get(tempEmployee_id);
                break;
            }
        }
        System.out.println(searchedEmployee);
        return;
    }

    public void showEmloyeeDetais()
    {
        for( Integer tempEmployee_id:EmployeeHandler.employees.keySet())
        {
            System.out.println(EmployeeHandler.employees.get(tempEmployee_id));
        }
    }


}
