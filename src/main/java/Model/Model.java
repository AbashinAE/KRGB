package Model;

public class Model {

    private AnimalShelter animalShelter;

    public Model() {
        this.animalShelter = new AnimalShelter();
    }

    public void addAnimal(String species, String name, int age) {
        animalShelter.addAnimal(species, name, age);
    }


    public Animal getAnimal(String species, String name) {
        return animalShelter.getAnimal(species, name);
    }

    public void learnAction(String species, String name, String action) {
        animalShelter.learnAction(species, name, action);
    }

    public void printAllAnimals() {
        animalShelter.printAllAnimals();
    }

    public void getSound () {
        animalShelter.getSound();
    }

    public void circus () {
        animalShelter.circus();
    }
}