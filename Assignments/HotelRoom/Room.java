package ClassCodes.OtherCodes.HotelRoom;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Room {
    static HashMap<Integer,Integer> roomsCapacity=new LinkedHashMap(5);
    static {
        for(int i=0;i<5;i++)
        {
            roomsCapacity.put(i+1,3);
        }
    }
    private static int[]rooms=new int[5];

    private static int[] exitrooms=new int[5];


    {
        for(int i=0;i<exitrooms.length;i++)
        {
            if(exitrooms[i]!=0)
            {
                rooms[exitrooms[i]-1]=0;
                exitrooms[i]=0;
            }
        }
    }
    protected int roomNumber;
    private boolean isBooked=false;
    private static int capacity=5;
    private double pricePerNight;
    public static int[] getRooms() {
        return rooms;
    }

    public static void setRooms(int[] rooms) {
        Room.rooms = rooms;
    }

    public static int getCapacity() {
        return capacity;
    }

    public static void setCapacity(int capacity) {
        Room.capacity = capacity;
    }

    public Room(int roomNumber,double pricePerNight)
    {
        this.roomNumber=roomNumber;
        this.pricePerNight=pricePerNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    private boolean isAvailabel()
    {
        if(this.roomNumber>rooms.length)
        {
            System.out.println("you entered wrong roomNumber");
            return false;
        }
        if(capacity==0)
        {
            return false;
        }
        if(roomsCapacity.get(this.roomNumber)==0)
        {
            return false;
        }
        else {
            return true;
        }
    }
    public static boolean isAvailable()
    {
        if(capacity==0)
        {
            return false;
        }
        return true;
    }
    public void makeReservation()
    {
        if(isAvailabel())
        {
            rooms[this.roomNumber-1]=this.roomNumber;
            int val=roomsCapacity.get(this.roomNumber);
            roomsCapacity.put(this.roomNumber,--val);
            if(val==0)
            {
                capacity--;
            }
            this.isBooked=true;
            System.out.println("your room is booked..");
        }
        else{
            System.out.println("Currently room is not available..");
        }
    }

    public void makeReservation(Date startDate)
    {

        if(isAvailabel())
        {
            rooms[this.roomNumber-1]=this.roomNumber;
            int val=roomsCapacity.get(this.roomNumber);
            System.out.println(val);
            roomsCapacity.put(this.roomNumber,--val);
            if(val==0)
            {
                capacity--;
            }
            this.isBooked=true;
            System.out.println("your room "+roomNumber+" is booked for "+startDate);

        }
        else{
            System.out.println("Currently room is not available..");
        }
    }

    public  void leaveRoom()
    {
        for(int i=0;i<exitrooms.length;i++)
        {
            if(exitrooms[i]==0)
            {
                exitrooms[i]=this.roomNumber;
                break;
            }
        }
        int val=roomsCapacity.get(this.roomNumber);
        roomsCapacity.put(this.roomNumber,++val);
        if(val==1)
        {
            capacity++;
        }
    }
    public void showRoomCapacites()
    {
        for(Object ob:roomsCapacity.keySet())
        {
            System.out.println(ob+"-"+roomsCapacity.get(ob));
        }
    }
    @Override
    public String toString()
    {
        if(isBooked)
            return "roomNumber "+this.roomNumber+" is booked at "+this.pricePerNight+"/- per Night";
        else
            return "your room is not yet booked";
    }
}
