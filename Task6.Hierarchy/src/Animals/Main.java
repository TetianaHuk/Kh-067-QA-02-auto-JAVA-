package Animals;

import Animals.Herbivorous.SmallestRodents.Smallest;
import Animals.Omnivores.Pantofags.*;
import Animals.Predators.Feline.BiggestFelines;

public class Main {

    public static void main(String[] args) {

        Smallest squirrel = new Smallest("Squirrel", 5, 25);
        squirrel.describe();
        squirrel.info();

        Smallest gopher = new Smallest("Gopher", 1, 3, 16);
        gopher.describe();
        gopher.info();

        Bear grizzly = new Bear("Grizzly", 8, 12);
        grizzly.describe();
        grizzly.info();

        Rat agouti = new Rat("Agouti", 2, 20);
        agouti.describe();
        agouti.info();

        BiggestFelines Lion = new BiggestFelines("Lion", 35, 28);
        Lion.describe();
        Lion.info();

        BiggestFelines Tiger = new BiggestFelines("Tiger", 7, 20, 2000);
        Tiger.describe();
        Tiger.info();

    }
}