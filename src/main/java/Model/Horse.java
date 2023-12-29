package Model;

public class Horse extends PackAnimal {

    public Horse(String species, String name, int age) {
        super(species, name, age);
        setVoice("Hi I'm a horse");
    }
}