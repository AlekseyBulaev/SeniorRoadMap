package chapter1.project1;

import java.util.ArrayList;
import java.util.List;

public class PlayfulPets {

    private static void matchPet(String criteria, PetMatcher matcher,
                                 Pet pet) {
        System.out.println("\n" + criteria + ":" +
                "\nFirst: " + matcher.first(pet) +
                "\nAll matches:");
        matcher.match(pet).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Pet.pets.add(new Pet("Scruffy", "dog", "poodle", "white", 895.00));
        Pet.pets.add(new Pet("Meow", "cat", "siamese", "white", 740.25));
        Pet.pets.add(new Pet("Max", "dog", "poodle", "black", 540.50));
        Pet.pets.add(new Pet("Cuddles", "dog", "pug", "black", 1282.75));
        Pet.pets.add(new Pet("Slider", "snake", "garden", "green", 320.00));

        PetMatcher breedMatcher = new PetMatcher() {
            @Override
            public List<Pet> match(Pet pet) {
                List<Pet> list = new ArrayList<>();
                for (Pet pet1 : Pet.pets) {
                    if (pet1.equals(pet)) {
                        list.add(pet1);
                    }
                }
                return list;
            }
        };
        PetMatcher priceMatcher = new PetMatcher() {
            @Override
            public List<Pet> match(Pet pet) {
                List<Pet> list = new ArrayList<>();
                for (Pet pet1 : Pet.pets) {
                    if (pet1.price <= pet.price) {
                        list.add(pet1);
                    }
                }
                return list;
            }

            @Override
            public Pet first(Pet pet) {
                for (Pet p : Pet.pets)
                    if (p.price <= pet.price)
                        return p;
                return null;
            }
        };

        matchPet("Poodles", breedMatcher, new Pet(null, "dog", "poodle", null, 0.0));
        matchPet("Pets for $800 or less", priceMatcher, new Pet(null, null, null, null, 800.0));
    }
}
