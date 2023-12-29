package Model;

import Model.Action;
import Model.Actionable;

import java.util.HashSet;
import java.util.Set;

public abstract class Animal implements Actionable {

    private String species;
    private String name;

    private String voice;
    private int age;


    Set<Action> actions;

    public Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
        actions = new HashSet<>();
    }


    @Override
    public void doAction(String action) {
        for (Action act : actions) {
            if (act.getAction().equals(action)) {
                System.out.print(this + " ");
                act.doAction();
            }
        }
    }

    public void doAllAction() {
        for (Action act : actions) {
            System.out.print(this.getSpecies() + " " + this.getName());
            act.doAction();
        }
    }

    @Override
    public void learnAction(String action) {
        actions.add(new Action(action));
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return String.format("Вид - %s,имя - %s, возраст - %d", species, name, age);
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }
}