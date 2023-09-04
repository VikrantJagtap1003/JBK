package August_29.ExceptionHandling.AdvanceHotelManagement;

public class InvalidTaskAssignment extends RuntimeException{

    public InvalidTaskAssignment(String str)
    {
        super(str);
    }

    public InvalidTaskAssignment()
    {

    }
}
