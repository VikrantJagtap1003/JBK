package August_29.ExceptionHandling.AdvanceReservationSystem;

import java.util.Date;

public class DeluxeRoom extends Room{

    private String type;
    public DeluxeRoom(int roomNumber, Date startDate, Date endDate, Guest  guest_info) {
       super(roomNumber,startDate,endDate,guest_info);
        this.type="Deulex Room";
    }

    @Override
    public String toString() {
        return "DeulexRoom{" +
                "type='" + type + '\'' +super.toString()+
                '}';
    }
}
