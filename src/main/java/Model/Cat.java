package Model;

public class Cat extends Pet {

    public Cat(String species,String name, int age) {
        super(species,name, age);
        setVoice(" Hi I'm a cat");
    }

}