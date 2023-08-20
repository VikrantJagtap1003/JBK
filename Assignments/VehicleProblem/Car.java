package ClassCodes.Vehicle_problem;

public class Car implements Vehicle{
    public String getName() {
        return vehicleName;
    }

    public void setName(String name) {
        this.vehicleName = name;
    }

    public Car(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    private String vehicleName;


    public void start()
    {
        System.out.println(this.vehicleName+" Car is Starting...");
    }

    public void accelerate()
    {
        System.out.println(this.vehicleName+" Car is accelerating.");
    }

    public void stop(){
        System.out.println(this.vehicleName+" Car is Stopping..");
    }
}
