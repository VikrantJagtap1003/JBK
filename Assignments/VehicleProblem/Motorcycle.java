package ClassCodes.Vehicle_problem;

public class Motorcycle implements Vehicle{
    public String getName() {
        return vehicleName;
    }

    public void setName(String name) {
        this.vehicleName = name;
    }

    public Motorcycle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    private String vehicleName;

    public void start()
    {
        System.out.println(this.vehicleName+" MotorCycle is Starting...");
    }

    public void accelerate()
    {
        System.out.println(this.vehicleName+" MotorCycle is accelerating.");
    }

    public void stop(){
        System.out.println(this.vehicleName+" MotorCycle is Stopping..");
    }
}
