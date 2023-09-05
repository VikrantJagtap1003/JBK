package August_29.ExceptionHandling.AdvanceReservationSystem;

import java.util.Date;

public  abstract class Room implements Book {
    private int roomNumber;
    private Date startDate;
    private Date endDate;

    private Guest guest_info;

    public Guest getGuest_info() {
        return guest_info;
    }

    public void setGuest_info(Guest guest_info) {
        this.guest_info = guest_info;
    }

    public Room()
    {

    }
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Room(int roomNumber, Date startDate, Date endDate,Guest guest_info) {
        this.roomNumber = roomNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.guest_info=guest_info;
    }

    @Override
    public String toString() {
        return
                "Guest info="+ guest_info+
                ", roomNumber=" + roomNumber +
                ", startDate=" + startDate +
                ", endDate=" + endDate ;
    }
}
