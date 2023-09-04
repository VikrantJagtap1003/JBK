package August_29.ExceptionHandling.AdvanceHotelManagement;

import java.util.*;

public class EmployeeManagement {
    private static Set<Integer> employeeids=new HashSet<>();
    private static List<FrontDesk> frontDeskList=new ArrayList<>();
    private static List<Maintenance> maintenanceList=new ArrayList<>();
    private static List<KitchenStaff> kitchenStaffList=new ArrayList<>();

    private static List<HouseKeeping> houseKeepingList=new ArrayList<>();

    public void hireFrontDesk(FrontDesk frontDesk)
    {
        try{
            if(employeeids.contains(frontDesk.getEmployeeId()))
            {
                throw new DuplicateEmployeeHiring();
            }
            else{
                employeeids.add(frontDesk.getEmployeeId());
                EmployeeManagement.frontDeskList.add(frontDesk);
            }
        }
        catch (DuplicateEmployeeHiring e)
        {
            e.printStackTrace();
            e.getMessage();
        }

    }

    public void fireFrontDesk(int id)
    {
        FrontDesk frontDesk=null;
        for(FrontDesk tempfrontDesk:EmployeeManagement.frontDeskList)
        {
            if(tempfrontDesk.getEmployeeId()==id)
            {
                frontDesk=tempfrontDesk;
                break;
            }
        }
        if(frontDesk!=null)
        {
            EmployeeManagement.frontDeskList.remove((Object)frontDesk);
            employeeids.remove((Object)frontDesk.getEmployeeId());
        }
        else{
            System.out.println("no such employee Present");
        }
    }

    public void hireMaintenance(Maintenance maintenance)
    {
        try{
            if(employeeids.contains(maintenance.getEmployeeId()))
            {
                throw new DuplicateEmployeeHiring();
            }
            else{
                employeeids.add(maintenance.getEmployeeId());
                EmployeeManagement.maintenanceList.add(maintenance);
            }
        }
        catch (DuplicateEmployeeHiring e)
        {
            e.printStackTrace();
            e.getMessage();
        }
    }

    public void fireMaintenance(int id)
    {
        Maintenance maintenance=null;
        for(Maintenance maintenance1:EmployeeManagement.maintenanceList)
        {
            if(maintenance1.getEmployeeId()==id)
            {
                maintenance=maintenance1;
                break;
            }
        }
        if(maintenance!=null)
        {
            EmployeeManagement.frontDeskList.remove((Object)maintenance);
            employeeids.remove((Object)maintenance.getEmployeeId());
        }
        else{
            System.out.println("no such employee Present");
        }
    }

    public void hireHousekeeping(HouseKeeping houseKeeping)
    {
        try{
        if(employeeids.contains(houseKeeping.getEmployeeId()))
        {
            throw new DuplicateEmployeeHiring();
        }
        else{
            employeeids.add(houseKeeping.getEmployeeId());
            EmployeeManagement.houseKeepingList.add(houseKeeping);
        }
        }
        catch (DuplicateEmployeeHiring e)
        {
            e.printStackTrace();
            e.getMessage();
        }
    }

    public void fireHouseKeeping(int id)
    {
        HouseKeeping houseKeeping=null;
        for(HouseKeeping houseKeeping1:EmployeeManagement.houseKeepingList)
        {
            if(houseKeeping1.getEmployeeId()==id)
            {
                houseKeeping=houseKeeping1;
                break;
            }
        }
        if(houseKeeping!=null)
        {
            EmployeeManagement.frontDeskList.remove((Object)houseKeeping);
            employeeids.remove((Object)houseKeeping.getEmployeeId());
        }
        else{
            System.out.println("no such employee Present");
        }
    }

    public void hireKitchenStaff(KitchenStaff kitchenStaff)
    {
        try{
            if(employeeids.contains(kitchenStaff.getEmployeeId()))
            {
                throw new DuplicateEmployeeHiring();
            }
            else{
                employeeids.add(kitchenStaff.getEmployeeId());
                EmployeeManagement.kitchenStaffList.add(kitchenStaff);
            }
        }
        catch (DuplicateEmployeeHiring e)
        {
            e.printStackTrace();
            e.getMessage();
        }
    }

    public void fireKitchenStaff(int id)
    {
        KitchenStaff kitchenStaff=null;
        for(KitchenStaff kitchenStaff1:EmployeeManagement.kitchenStaffList)
        {
            if(kitchenStaff1.getEmployeeId()==id)
            {
                kitchenStaff=kitchenStaff1;
                break;
            }
        }
        if(kitchenStaff!=null)
        {
            EmployeeManagement.frontDeskList.remove((Object)kitchenStaff);
            employeeids.remove((Object)kitchenStaff.getEmployeeId());
        }
        else{
            System.out.println("no such employee Present");
        }
    }

    public void giveTask() throws Exception
    {
        System.out.println("For giving task for Employee \npress 1 for FrontDesk\n2 for" +
                "Kitchen Staff\n3 for Maintenance\n4 for HouseKeeping");
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        while (true)
        {
            if(val>=1 &&val<=4)
            {
                break;
            }
            else{
                System.out.println("your selected option is not available please select proper one");
                val=sc.nextInt();
            }
        }
        System.out.println("Enter employee id to which you want to give task");
        int id=sc.nextInt();
        Employee tempEmp=null;
        try{
            if(val==1)
            {
                if((tempEmp=findEmployee(EmployeeManagement.frontDeskList,id))!=null)
                {
                        System.out.println(tempEmp.getEmployeeName()+" is  present at FrontDesk");
                }
                else{
                    throw new InvalidTaskAssignment("no such FrontDesk Available");
                }
            }
            if(val==2)
            {
                if((tempEmp=findEmployee(EmployeeManagement.kitchenStaffList,id))!=null)
                {
                    System.out.println(tempEmp.getEmployeeName()+" is  cooking the food");
                }
                else{
                    throw new InvalidTaskAssignment("no such KitchenStaff Available");
                }
            }
            if(val==3)
            {
                if((tempEmp=findEmployee(EmployeeManagement.maintenanceList,id))!=null)
                {
                    System.out.println(tempEmp.getEmployeeName()+" is  maintaining the room");
                }
                else{
                    throw new InvalidTaskAssignment("no such Maintenance Person Available");
                }
            }
            if(val==4)
            {
                if((tempEmp=findEmployee(EmployeeManagement.houseKeepingList,id))!=null)
                {
                    System.out.println(tempEmp.getEmployeeName()+" is cleaning the room ");
                }
                else{
                    throw new InvalidTaskAssignment("no such HouseKeeping Available");
                }
            }

        }
        catch (InvalidTaskAssignment e)
        {
            e.getMessage();
            e.printStackTrace();
        }

    }

    private Employee findEmployee(List<? extends Employee> list,int id)
    {
        Employee employee1=null;
        for(Employee employee:list)
        {
            if(employee.getEmployeeId()==id)
            {
                employee1=employee;
                break;
            }

        }
        return employee1;
    }
}
