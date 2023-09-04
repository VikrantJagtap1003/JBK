package August_29.ExceptionHandling.AdvanceHotelManagement;

public class DuplicateEmployeeHiring extends RuntimeException{

    public DuplicateEmployeeHiring()
    {
        super("This Employee is already hired");
    }
}
