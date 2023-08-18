package ClassCodes.OtherCodes.AnimalZoo;

public class Zoo {
    Animal [] animal;

    public Zoo(Animal [] animal)
    {
        this.animal=animal;
        for(int i=0;i<animal.length;i++)
        {
            animal[i].makeSound();
        }
    }
}
