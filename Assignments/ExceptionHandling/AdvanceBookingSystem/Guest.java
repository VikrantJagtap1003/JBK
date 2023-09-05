package August_29.ExceptionHandling.AdvanceReservationSystem;

public class Guest {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;

    public Guest() {
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public Guest(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
