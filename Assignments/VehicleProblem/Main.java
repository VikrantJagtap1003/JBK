package ClassCodes.Vehicle_problem;

public class Main {
    public static void main(String[] args) {
        Vehicle Car=new Car("Fortuner");
        Car.start();
        Car.accelerate();
        Car.stop();

        Vehicle MotorCycle=new Car("Duke390");
        MotorCycle.start();
        MotorCycle.accelerate();
        MotorCycle.stop();
    }
}
