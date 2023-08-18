package ClassCodes.OtherCodes.HotelRoom;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Room room1=new Room(4,1000);
        Room room2=new Room(4,1000);
        Room room3=new Room(4,1000);
        Room room4=new Room(4,1000);

        room1.makeReservation(new Date("12/08/2020"));
        room2.makeReservation(new Date("14/08/2020"));
        room3.makeReservation(new Date("16/08/2020"));
        room4.showRoomCapacites();

       System.out.println( room4.isAvailable());



    }
}
