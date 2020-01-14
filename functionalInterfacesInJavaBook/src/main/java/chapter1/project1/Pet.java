package chapter1.project1;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    static List<Pet> pets = new ArrayList<>();

    String name;
    String animal;
    String breed;
    String color;
    double price;

    public Pet(String name, String animal, String breed, String color, double price) {
        this.name = name;
        this.animal = animal;
        this.breed = breed;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ":" + " a " + color + " " + breed
                + " " + animal + " for $" + price;
    }

    @Override
    public boolean equals(Object o) {
        Pet pet = (Pet) o;
        return animal.equals(pet.animal) && breed.equals(pet.breed);
    }
}
