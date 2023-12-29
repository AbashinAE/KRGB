package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnimalShelter {

    private int petCount;

    private int packAnimalCount;

    private int allAnimalCount;

    private List<Pet> pets;

    private List<PackAnimal> packAnimals;

    public AnimalShelter() {
        petCount = 0;
        packAnimalCount = 0;
        this.allAnimalCount = 0;
        pets = new ArrayList<>();
        packAnimals = new ArrayList<>();
    }

    public void addAnimal(String species, String name, int age) {
        switch (species) {
            case "Сat" -> {
                pets.add(new Cat(species, name, age));
                System.out.println(" Animal added successfully!");
                petCount++;
                allAnimalCount++;
            }
            case "Hamster" -> {
                pets.add(new Hamster(species, name, age));
                System.out.println(" Animal added successfully!");
                petCount++;
                allAnimalCount++;
            }
            case "Dog" -> {
                pets.add(new Dog(species, name, age));
                System.out.println(" Animal added successfully!");
                petCount++;
                allAnimalCount++;
            }
            case "Camel" -> {
                packAnimals.add(new Camel(species, name, age));
                System.out.println(" Animal added successfully!");
                packAnimalCount++;
                allAnimalCount++;
            }
            case "Horse" -> {
                packAnimals.add(new Horse(species, name, age));
                System.out.println(" Animal added successfully!");
                packAnimalCount++;
                allAnimalCount++;
            }
            case "Donkey" -> {
                packAnimals.add(new Donkey(species, name, age));
                System.out.println(" Animal added successfully!");
                packAnimalCount++;
                allAnimalCount++;
            }
            default -> System.out.println(" no animal added! ");
        }
    }


    public Animal getAnimal(String species, String name) {
        switch (species) {
            case "Cat", "Hamster", "Dog" -> {
                Animal pet = null;
                for (Pet p : pets) {
                    if (p.getName().equals(name) && p.getSpecies().equals(species)) {
                        pet = p;
                        return pet;
                    }
                }
                return pet;
            }
            case "Camel", "Horse", "Donkey" -> {
                PackAnimal packAnimal = null;
                for (PackAnimal p : packAnimals) {
                    if (p.getName().equals(name) && p.getSpecies().equals(species)) {
                        packAnimal = p;
                        return packAnimal;
                    }
                }

            }
            default -> {
                return null;
            }
        }
        return null;
    }

    public void learnAction(String species, String name, String action) {
        switch (species) {
            case "Cat", "Hamster", "Dog" -> {
                for (Pet p : pets) {
                    if (p.getSpecies().equals(species) && p.getName().equalsIgnoreCase(name)) p.learnAction(action);
                    System.out.println(" The animal has been successfully trained!");
                }
            }
            case "Camel", "Horse", "Donkey" -> {
                for (PackAnimal p : packAnimals) {
                    if (p.getSpecies().equals(species) && p.getName().equalsIgnoreCase(name)) p.learnAction(action);
                    System.out.println(" The animal has been successfully trained!");
                }
            }
            default -> System.out.println(" We don't have such an animal!");
        }
    }

    public void printAllAnimals() {
        System.out.println(" Total number of pets " + petCount);
        System.out.println(" Total number of animal: " + allAnimalCount);
        System.out.println(" Total number of packAnimals " + packAnimalCount);
    }

    public void getSound() {
        for (Pet pet : pets) {
            System.out.println(pet.getName() + " makes a sound " + pet.getVoice());
        }
        for (PackAnimal packAnimal : packAnimals) {
            System.out.println(packAnimal.getName() + " makes a sound " + packAnimal.getVoice());
        }
    }

    public void circus() {
        for (Pet pet : pets) {
            pet.doAllAction();
        }
        for (PackAnimal packAnimal : packAnimals) {
            packAnimal.doAllAction();
        }
    }
}