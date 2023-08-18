package ClassCodes.OtherCodes.AnimalZoo;

public class Main {
    public static void main(String[] args) {

        Lion lion=new Lion("Sam",20);
        Elephant elephant=new Elephant("Siri",36);
        Giraffe giraffe=new Giraffe("gav",25);
        Animal[] animal={lion,elephant,giraffe};
        Zoo zoo=new Zoo(animal);
    }

}
