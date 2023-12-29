package Presenter;

import Model.Model;
import Model.Animal;

public class Presenter {

    private Model model;

    public Presenter() {
        this.model = new Model();
    }

    public void addAnimal(String species, String name, int age) {
        model.addAnimal(species, name, age);
    }

    public Animal getAnimal(String species, String name) {
        return model.getAnimal(species, name);
    }

    public void learnAction(String species, String name, String action) {
        model.learnAction(species, name, action);
    }

    public void printAllAnimals() {
        model.printAllAnimals();
    }

    public void getSound () {
        model.getSound();
    }

    public void circus () {
        model.circus();
    }
}