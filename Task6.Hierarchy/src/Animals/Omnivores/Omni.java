package Animals.Omnivores;

import Animals.Animals;

public class Omni extends Animals {

    public Omni(int tail, int fur) {
        this.setTail(tail);
        this.setFur(fur);
    }

    @Override
    public void describe() {
        System.out.print("\nEat everything.");
    }
}