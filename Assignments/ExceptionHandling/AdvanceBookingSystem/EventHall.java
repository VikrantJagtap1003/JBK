package August_29.ExceptionHandling.AdvanceReservationSystem;

import java.util.Date;

public class EventHall implements Book{
    private Date startDate;
    private Date endDate;

    public EventHall()
    {

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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Guest HallBookingPersonInform() {
        return HallBookingPersonInform;
    }

    public void setNameOfHallBookingPerson(Guest HallBookingPersonInform) {
        this.HallBookingPersonInform = HallBookingPersonInform;
    }

    public EventHall(Date startDate, Date endDate, double amount, Guest HallBookingPersonInform) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
        this.HallBookingPersonInform = HallBookingPersonInform;
    }

    private double amount;

    private Guest HallBookingPersonInform;

    @Override
    public String toString() {
        return "EventHall{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", amount=" + amount +
                ", HallBookingPersonInform='" + HallBookingPersonInform + '\'' +
                '}';
    }
}
