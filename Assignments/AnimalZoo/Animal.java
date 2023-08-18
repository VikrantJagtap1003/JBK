package ClassCodes.OtherCodes.AnimalZoo;

public  abstract class Animal {
    private String name;
    private int age;


    public Animal(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void makeSound()
    {
        System.out.println("Animal is making Sound");
    }
}
