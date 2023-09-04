package August_29.ExceptionHandling.AdvanceHotelManagement;

public class Main {
    public static void main(String[] args) {
            FrontDesk frontDesk1=new FrontDesk(1,"frontdesk1",20);
            HouseKeeping houseKeeping1=new HouseKeeping(2,"houseKeeping1",22);
            Maintenance maintenance1=new Maintenance(4,"Maintenance",23);
            KitchenStaff kitchenStaff1=new KitchenStaff(3,"KitchenStaff",25);

            EmployeeManagement employeeManagement=new EmployeeManagement();

            employeeManagement.hireFrontDesk(frontDesk1);
            employeeManagement.hireKitchenStaff(kitchenStaff1);
            employeeManagement.hireHousekeeping(houseKeeping1);
            employeeManagement.hireMaintenance(maintenance1);
    }
}
