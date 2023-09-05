package August_29.ExceptionHandling.AdvanceReservationSystem;

import java.util.Date;

public class StandardRoom extends Room{

    private String type;
    public StandardRoom(int roomNumber, Date startDate, Date endDate,Guest guest_info) {
       super(roomNumber,startDate,endDate,guest_info);
        this.type="Standard Room ";
    }

    @Override
    public String toString() {
        return "StandardRoom{" +
                "type='" + type + '\'' +super.toString()+
                '}';
    }
}
