package Animals.Herbivorous;

import Animals.Animals;

public class Rodents extends Animals {

    public Rodents(int fur, int tail) {
        this.setFur(fur);
        this.setTail(tail);
    }

    @Override
    public void describe() {
        System.out.print("\nHerbivorous animals -those who eats plants. ");
    }
}
