package Animals.Predators;

import Animals.Animals;

public class Pre extends Animals {
    public Pre(int fur, int tail) {
        this.setFur(fur);
        this.setTail(tail);
    }

    @Override
    public void describe() {
        System.out.print("\nEar other animals. ");
    }
}

