package Model;

public class Hamster extends Pet {

    public Hamster(String species,String name, int age) {
        super(species,name, age);
        setVoice("Hi I'm a hamster");
    }
}