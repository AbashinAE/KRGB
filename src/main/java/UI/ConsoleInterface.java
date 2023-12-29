package UI;

import Model.Animal;
import Presenter.Presenter;

import java.util.Scanner;

public class ConsoleInterface {

    private Scanner console;

    private Presenter presenter;

    private String select = """         
            1. Add an animal.
            2. Check for an animal.
            3. Train an animal.
            4. Total number of animal.
            5. Arrange a roll call.
            6. Show what the animal can do.
            7. Exit.
            """;

    public ConsoleInterface() {
        this.console = new Scanner(System.in);
        this.presenter = new Presenter();
    }

    public void animalShelterMenu() {
        String species;
        String name;
        int age;
        while (true) {
            System.out.println("=".repeat(50));
            System.out.println(select);
            System.out.println("=".repeat(50));
            switch (console.nextLine()) {
                case "1" -> {
                    System.out.println("Enter type, animal name and age of the animal");
                    species = console.nextLine().toLowerCase();
                    name = console.nextLine();
                    try {
                        age = Integer.parseInt(console.nextLine());
                        presenter.addAnimal(species, name, age);
                    } catch (Exception e) {
                        System.out.println(" Invalid number format");
                    }
                }
                case "2" -> {
                    System.out.println(" Enter type and animal name");
                    species = console.nextLine().toLowerCase();
                    name = console.nextLine().toLowerCase();
                    Animal animal = presenter.getAnimal(species, name);
                    if (animal != null) System.out.println(animal);
                    else System.out.println(" Animal not found!");
                }
                case "3" -> {
                    System.out.println("Enter type, animal name и training command\n");
                    String action;
                    species = console.nextLine().toLowerCase();
                    name = console.nextLine();
                    action = console.nextLine();
                    presenter.learnAction(species, name, action);
                }
                case "4" -> presenter.printAllAnimals();
                case "5" -> presenter.getSound();
                case "6" -> presenter.circus();
                case "7" -> {
                    return;
                }
                default -> System.out.println(" Incorrect!");
            }
        }
    }
}